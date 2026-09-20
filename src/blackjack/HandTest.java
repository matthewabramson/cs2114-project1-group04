package blackjack;

import student.TestCase;

public class HandTest extends TestCase {

    private Hand hand;

    public void setUp() {
        hand = new Hand();
    }

    public void testNewHand() {
        assertEquals(0, hand.getTotal());
    }

    public void testAddCard() {
        Card card = new Card("5", "♣\uFE0F", 5);

        hand.addCard(card);

        assertEquals(5, hand.getTotal());
    }

    public void testMultipleCards() {
        hand.addCard(new Card("5", "♦\uFE0F", 5));
        hand.addCard(new Card("7", "♣\uFE0F", 7));

        assertEquals(12, hand.getTotal());
    }

    public void testFaceCards() {
        hand.addCard(new Card("King", "♦\uFE0F", 10));
        hand.addCard(new Card("Queen", "♣\uFE0F", 10));

        assertEquals(20, hand.getTotal());
    }

    public void testAceAsEleven() {
        hand.addCard(new Card("Ace", "♦\uFE0F", 11));
        hand.addCard(new Card("9", "♣\uFE0F",  9));

        assertEquals(20, hand.getTotal());
    }

    public void testAceAsOne() {
        hand.addCard(new Card("Ace", "♦\uFE0F", 11));
        hand.addCard(new Card("9", "♣\uFE0F", 9));
        hand.addCard(new Card("5", "♦\uFE0F", 5));

        // 11 + 9 + 5 = 25
        // Ace changes from 11 to 1
        // 1 + 9 + 5 = 15
        assertEquals(15, hand.getTotal());
    }

    public void testMultipleAces() {
        hand.addCard(new Card("Ace", "♣\uFE0F", 11));
        hand.addCard(new Card("Ace", "♣\uFE0F", 11));
        hand.addCard(new Card("9", "♦\uFE0F", 9));

        // 11 + 11 + 9 = 31
        // One Ace becomes 1
        // 1 + 11 + 9 = 21
        assertEquals(21, hand.getTotal());
    }

    public void testBust() {
        hand.addCard(new Card("King", "♦\uFE0F", 10));
        hand.addCard(new Card("Queen", "♦\uFE0F", 10));
        hand.addCard(new Card("5", "♣\uFE0F", 5));

        assertEquals(25, hand.getTotal());
    }
}
