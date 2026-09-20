package blackjack;
public class BlackjackGame { 
  private Deck deck;
  private Player player; 
  private Dealer dealer; 
  private InputHandler input; 
  private Statistics stats; 

  public BlackjackGame(int bankroll) {
    deck = new Deck();
    player = new Player(bankroll); 
    dealer = new Dealer();
    input = new InputHandler();
    stats = new Statistics();
  }

  // starts the game 
  public void play() {
    System.out.println("Welcome to Lucky 21 ");

    boolean playAgain = true;

    while (playAgain) { 
      playRound();

      String again = input.getPlayAgain();
      
      if (again.equalsIgnoreCase("leave")) {
        playAgain = false;
      }
    }

    System.out.println("Final Stats:");
    System.out.println("Wins: " + stats.getWins());
    System.out.println("Losses: " + stats.getLosses());
    System.out.println("Pushes: " + stats.getPushes()); 
  }

  //runs each round of BlackJack
  public void playRound() {
    if (deck.isEmpty()) {
      deck = new Deck();
      deck.shuffle();
    }

    dealer.clearHand();
    player.getHand().clear();

    int bet = input.getBet(); 
    if (!player.placeBet(bet)) { 
      System.out.println("Invalid Bet."); 
      return;
    }

    player.subtractBet();

    // The Initial deal 
    player.getHand().addCard(deck.dealCard());
    player.getHand().addCard(deck.dealCard()); 
    dealer.getHand().addCard(deck.dealCard()); 
    
    // show player total
    System.out.println("Player Hand Total: " + player.getHand().getTotal());

    // show dealers only card
    Card dealerUpCard = dealer.getHand().getCard(0); 
    System.out.println("Dealer Shows: " + dealerUpCard.getRank() + " (" + dealerUpCard.getValue() + ")");

    // Player turn 
    boolean playerTurn = true;
    while (playerTurn) { 
      String choice = input.getHitOrStay();

      if (choice.equalsIgnoreCase("hit")) {
        player.getHand().addCard(deck.dealCard());
        System.out.println("Player Total: " + player.getHand().getTotal());

        // When the player busts so dealer dosen't draw
        if (player.getHand().getTotal() > 21) { 
          System.out.println("Player busts!");
          System.out.println("You lose!");
          stats.recordLoss(); 
          return;
        }
      }
      else { 
        playerTurn = false;
      }
    }

    // Dealer turn after player stop hitting/stays 
    while (dealer.shouldHit()) {
      dealer.getHand().addCard(deck.dealCard());
      System.out.println("Dealer Total: " + dealer.getHand().getTotal());
    }

    determineWinner();
}
  
  public void determineWinner() {

    int playerTotal = player.getHand().getTotal();
    int dealerTotal = dealer.getHand().getTotal();

    if (dealerTotal > 21) {

        stats.recordWin();
        player.addWinnings();

        System.out.println("Dealer busts. You win!");
    }
    else if (playerTotal > dealerTotal) {

        stats.recordWin();
        player.addWinnings();

        System.out.println("You win!");
    }
    else if (playerTotal == dealerTotal) {

        stats.recordPush();
        player.returnBet();

        System.out.println("Push.");
    }
    else {

        stats.recordLoss();

        System.out.println("You lose.");
      }
  }
}
