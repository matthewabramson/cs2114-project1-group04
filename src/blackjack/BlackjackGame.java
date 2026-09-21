// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Rudra Dutta (drudra)
// LLM Statement:
// // During the preparation of this assignment, I, Jacob Dial used hokieAI in
// assistance for syntax and debugging.
// After using this tool, I reviewed and edited the content as needed to ensure
// its
// accuracy and take full responsibility for the content in relation to grading.
// I understand
// that I am responsible for being able to complete this work without the use of
// assistance.
package blackjack;

/**
 * Controls the main Blackjack game.
 * The game handles the player, dealer, deck, bets,
 * player turns, dealer turns, and game statistics.
 */
public class BlackjackGame { 
  private Deck deck;
  private Player player; 
  private Dealer dealer; 
  private InputHandler input; 
  private Statistics stats; 
  
  
  /**
   * Creates a new BlackjackGame object.
   *
   * @param bankroll the starting amount of money for the player
   */
  public BlackjackGame(int bankroll) {
      
    deck = new Deck();
    player = new Player(bankroll); 
    dealer = new Dealer();
    input = new InputHandler();
    stats = new Statistics();
  }
    /**
    * Starts the Blackjack game using a starting bankroll of $1000.
    *
    *   @param args command-line arguments
    */
  public static void main(String[] args) {
      BlackjackGame game = new BlackjackGame(1000);
      game.play();
      
  }
   /**
   * Starts the game and continues playing rounds until
   * the player chooses to leave.
   */
  
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

  /**
   * Runs one round of Blackjack.
   * The player places a bet, receives two cards,
   * and plays by choosing to hit or stand. The dealer
   * then draws cards until reaching a total of at least 17.
   */
  
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
  /**
   * Determines the winner of the current round.
   * The player wins if the dealer busts or if the player's
   * total is higher than the dealer's total. A tie results
   * in a push and the player's bet is returned.
   */
  
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
