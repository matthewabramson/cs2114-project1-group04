package blackjack;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<Card>();

        String[] suits = {"♠\uFE0F", "♥\uFE0F", "♦\uFE0F", "♣\uFE0F"};
        String[] ranks = {
            "Ace", "2", "3", "4", "5", "6", "7",
            "8", "9", "10", "J", "Q", "K"
        };

        // 8 decks
        for (int deckNumber = 0; deckNumber < 8; deckNumber++) {

            for (String suit : suits) {

                for (String rank : ranks) {

                    int value;

                    if (rank.equals("Ace")) {
                        value = 11;
                    }
                    else if (rank.equals("J") ||
                             rank.equals("Q") ||
                             rank.equals("K")) {
                        value = 10;
                    }
                    else {
                        value = Integer.parseInt(rank);
                    }

                    cards.add(new Card(rank, suit, value));
                }
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }

    public Card dealCard() {

        if (cards.isEmpty()) {
            return null;
        }

        return cards.remove(cards.size() - 1);
    }
}
