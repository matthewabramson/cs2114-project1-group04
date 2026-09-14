

import java.util.Random;
import java.util.ArrayList;

public class Deck{

    private static String[] cardSuite = {"♠\uFE0F", "♥\uFE0F", "♦\uFE0F", "♣\uFE0F"};
    private static String[] cardNumber = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    private static ArrayList<String> cardsDealt = new ArrayList<>();
    private static Random random = new Random();

    public static String dealCard() {

        boolean dealCard = true;
        String card = "";

        while (dealCard) {

            if (cardsDealt.size() >= 400){
                cardsDealt.clear();
            }

            int randomCardSuiteIndex = random.nextInt(cardSuite.length);
            int randomCardNumberIndex = random.nextInt(cardNumber.length);

            card = cardNumber[randomCardNumberIndex] + cardSuite[randomCardSuiteIndex];

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

        return card;

    }
}