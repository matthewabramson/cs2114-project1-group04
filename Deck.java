

import java.util.Random;

public class Deck{

    private static String[] cardSuite = {"♠\uFE0F", "♥\uFE0F", "♦\uFE0F", "♣\uFE0F"};
    private static String[] cardNumber = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    private static Random random = new Random();

    public static String dealCard() {

        int randomCardSuiteIndex = random.nextInt(cardSuite.length);
        int randomCardNumberIndex = random.nextInt(cardNumber.length);

        String card = cardNumber[randomCardNumberIndex] + cardSuite[randomCardSuiteIndex];

        return card;

    }
}