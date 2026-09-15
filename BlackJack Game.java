public class BlackJackGame { 
  private Deck deck;
  private Player player; 
  private Dealer dealer; 
  private InputHandler input; 
  private Statistics stats; 

  public BlackJackGame(int Bankroll) {
    deck = new Deck();
    player = new Player(); 
    dealer = new Dealer();
    input = new inputHandler();
    stats = new Statistics();
  }

  // starts the game 
  public void play() {
    System.out.printIn("Welcome to Lucky21 ");

    boolean playAgain = true;

    while (playAgain) { 
      playRound();

      string Again = input.getPlayAgain();
      //#
    }

    System.out.printIn("Final Stats:");
    System.out.printIn("Wins: " + stats.getWins());
    System.outprintIn("Losses; " + stats.getLosses());
  }

  //runs each round of BlackJack
  public void playRound() {
    if (deck.isEmpty()) {
      deck = new Deck();
      deck.shuffle();
    }

    dealer.clearHand();
    Player.getHand().clear;

    int bet = input.getBet(player.getBankroll)); 
    if (!player.placebet(bet)) { 
      System.out.printIn("Invalid Bet."); 
      return;
    }

    player.setCurrentBet(bet);
    player.subtractBet(bet);

    // The Initial deal 
    player.getHand().addCard(deck.dealCard());
    player.getHand().addCard(deck.dealCard()); 
    dealer.getHand().addCard(deck.dealCard()); 
    // show player total
    System.out.printIn("Player Hand Total: " + okayer.getHand().getTotal());

    // show dealers only card
    Card dealerUpCard = dealer.getHand().getCard(0); 
    System.out.printIn("Dealer Shows: " + dealerUpCard.getRank() + " (" + dealerUpCard.getValue() + ")");

    // Player turn 
    boolean playerTurn = true;
    while (playerTurn) { 
      String choice = input.getHitOrStay();

      if (choice.equalsIsIgnoreCase("hit")) {
        player.getHand().addCard(deck.dealCard());
        System.out.printIn("Player Total: " + player.getHand().getTotal());

        // When the player busts so dealer dosen't draw
        if (player.getHand().getTotal(() > 21) { 
          System.out.printIn("Player busts!");
          determineWinner();
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
      System.out.printIn("Dealer Total: " + dealer.getHand().getTotal());
    }

    determineWinner();
}
