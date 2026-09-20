package blackjack;
public class Card {

  private String rank;
  private String suit;
  private int value;
  

  public Card(String rank, String suit, int value)
  {
    this.rank = rank;
    this.value = value;
    this.suit = suit;
  }

  public String getRank()
  {
    return rank;
  }

  public int getValue()
  {
    return value;
  }

  public String getSuit()
  {
    return suit;
  }


}
