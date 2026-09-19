public class Hand{

  private ArrayList<Cards> cards;

  import.java.until.ArrayList;

  public Hand(){
    cards = new ArrayList<Cards>
  }
  pubic void addCard(Card card){
    cards.add(card);
  }

  public int getTotal(){
    int total = 0
    int aces = 0

    for (Card card: cards) {
            total += card.getValue();

            if (card.isAce()) {
                aces++;
            }
        }

        // Change an Ace from 11 to 1 if the hand would bust
        while (total > 21 && aces > 0) {
            total -= 10;
            aces--;
        }

        return total;
    }
}
    
    

  

