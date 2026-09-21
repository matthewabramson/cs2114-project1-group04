package blackjack;

/**
 * // -------------------------------------------------------------------------
/**
 *  This class represents a playing card within the deck. The cards are each 
 *  given a suit and a value that is used for the game
 * 
 *  @author matthewabramson
 *  @version Sep 20, 2026
 */
public class Card {

  private String rank;
  private String suit;
  private int value;
  
/**
 * Initiates a new card with a rank, suit, and value 
 * @param rank assigns the card a rank
 * @param suit assigns the card a suit 
 * @param value assigns the card a value - used for BJ scoring 
 */
  public Card(String rank, String suit, int value)
  {
    this.rank = rank;
    this.value = value;
    this.suit = suit;
  }

  /**
   * returns the rank of the card 
   * @return the card's rank (Ace, Seven, Etc.)
   */
  public String getRank()
  {
    return rank;
  }

  /**
   * returns the value of the card 
   * @return the card's value for the BJ game 
   */
  public int getValue()
  {
    return value;
  }

  /**
   * returns the suit of the given card
   * @return the card's suit (Spade, club, diamond, heart)
   */
  public String getSuit()
  {
    return suit;
  }


}
