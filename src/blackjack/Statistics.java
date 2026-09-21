package blackjack;

/**
 * // -------------------------------------------------------------------------
/**
 * This class tracks a players statistics over the history of playing.
 * It tracks things like wins and losses
 * 
 *  @author matthewabramson
 *  @version Sep 20, 2026
 */
public class Statistics {
  private int wins;
  private int losses;
  private int pushes; 
  
  
  /**
   * Creates the statistics object and sets all the values to zero
   */
  public Statistics(){
    wins = 0;
    losses = 0;
    pushes = 0;
  }

  /**
   * Records when the user gets win and increases the win value by one
   */
  public void recordWin(){
    wins ++;
  }

  /**
   * Records when the user loses and increases the losses value by one 
   */
  public void recordLoss(){
    losses ++;
  }

  /**
   * Records when the user pushes against the dealer and increases
   * that value by one
   */
  public void recordPush() { 
    pushes++; 
  }

  /**
   * Returns the total number of wins
   * @return the wins by user
   */
  public int getWins(){
    return wins;
  }

  /**
   * returns the total number of losses
   * @return the users losses
   */
  public int getLosses(){
    return losses;
  }

  /**
   * returns the total number of pushes 
   * @return the total number of pushes 
   */
  public int getPushes() { 
    return pushes;
  }
  
}
  

