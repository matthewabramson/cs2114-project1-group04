public class Statistics {
  private int wins;
  private int losses;
  private int pushes; 
  
  
  public Statistics(){
    wins = 0;
    losses = 0;
    pushes = 0;
  }

  public void recordWin(){
    wins ++;
  }

  public void recordLoss(){
    losses ++;
  }

  public void recordPush() { 
    pushes++; 
  }

  public int getWins(){
    return wins;
  }

  public int getLosses(){
    return losses;
  }

  public int getPushes() { 
    return pushes;
  }
  
}
  

