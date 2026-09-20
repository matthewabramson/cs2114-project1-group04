public class Statistics {
  private int wins;
  private int losses;
  public Statistics(){
    wins = 0;
    losses = 0;
  }

  public void returnWin(){
    wins ++;
  }

  public void returnLoss(){
    losses ++;
  }

  public int getWins(){
    return wins;
  }

  public int getLosses(){
    return losses;
  }
  
}
