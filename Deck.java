

import java.util.Random;
import java.util.ArrayList;

public class Deck{

    private static String[] cardSuit = {"♠\uFE0F", "♥\uFE0F", "♦\uFE0F", "♣\uFE0F"};
    private static String[] cardNumber = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    private static ArrayList<String> cardsDealt = new ArrayList<>();
    private static Random random = new Random();

    public Card dealCard() {

        boolean dealCard = true;
        String card = "";
        Card newCard = null;

        while (dealCard) {

            if (cardsDealt.size() >= 400){
                cardsDealt.clear();
            }

            int randomCardSuitIndex = random.nextInt(cardSuit.length);
            int randomCardNumberIndex = random.nextInt(cardNumber.length);

            String rank = cardNumber[randomCardNumberIndex];
            String suit = cardSuit[randomCardSuitIndex];
            card = rank + suit;

            int value;
            if (rank.equals("Ace")){
                value = 11;
            }
            else if (rank.equals("J") || rank.equals("Q") || rank.equals("K")){
                value = 10;
            }
            else{
                value = Integer.parseInt(rank);
            }
            newCard = new Card(rank, suit, value);
                
                
        

            if (cardsDealt.contains(card)) {

               int count = 0;

               for (String card1 : cardsDealt){

                   if ( card1.equals(card) ){
                       count ++;
                   }
               }

               if (count < 8){

                   dealCard = false;

               }

            }

            else {

                dealCard = false;

            }




        }
        cardsDealt.add(card);

        return newCard;

    }
}
