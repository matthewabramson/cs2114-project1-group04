import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> cards;

    public Hand() {
        cards = new ArrayList<Card>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public void clear(){
        cards.clear();
    }
    
    public int getTotal() {
        int total = 0;
        int aces = 0;

        for (Card card : cards) {
            total += card.getValue();

            if (card.getRank().equals("Ace")) {
                aces++;
            }
        }

        // Change Aces from 11 to 1 if the hand would bust
        while (total > 21 && aces > 0) {
            total -= 10;
            aces--;
        }

        return total;
    }
}
    
    

  

