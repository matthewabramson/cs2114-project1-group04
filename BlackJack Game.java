public class BlackJackGame { 
  private Deck deck;
  private Player player; 
  private Dealer dealer; 
  private Statistics record; 

  public BlackJackGame() {
    deck = new Deck();
    player = new Player(); 
    dealer = new Dealer();
    record = new Statistics();
  }

  // returns player's hand 
  public Hand getHand() { 
    return player.getHand();
  }

  // starts the game 
  public void play() {
    System.out.printIn("Starting Blackjack... ");
    deck.shuffle();

    boolean continuePlaying = true;

    while continuePlaying { 
      playRound();

      // Come back later to add input logic to ask if user wants to continue 
      continuePlaying = false;
    }

    System.out.printIn("Game Over!");
    record.printStats();
  }
      
    
  

}
