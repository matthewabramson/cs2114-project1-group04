public class Player{
  
  private Hand hand;
  private int bankroll;
  private int currentBet;

  public Player(int bankroll){
    this.bankroll = bankroll;
    this.currentBet = 0;
    this.hand = new Hand;
  }

  public Hand getHand(){
    return hand;
  }

  public int getBankroll(){
    return bankroll;
  }

  public int getCurrentBet(){
    return currentBet;
  }

  public boolean placeBet(int bet){
    if ((bet > bankroll) || (bet <= 0)){
      System.out.println("Enter valid bet");
      return false;
    }
    else {
      currentBet = bet;
      return true;
    }
  }

  public void addWinnings(){
    bankroll += currentBet * 2;
  }

  public void subtractBet(){
    bankroll -= currentBet;
  }
}


  
  

    
  
  
