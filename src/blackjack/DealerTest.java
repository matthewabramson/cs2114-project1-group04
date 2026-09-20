package blackjack;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Tests the Dealer class.
 */
public class DealerTest {

    /**
     * Tests that the dealer has a hand when created.
     */
    @Test
    public void testGetHand() {

        Dealer dealer = new Dealer();

        assertNotNull(dealer.getHand());
    }

    /**
     * Tests that the dealer should hit when the hand is below 17.
     */
    @Test
    public void testShouldHitBelow17() {

        Dealer dealer = new Dealer();

        dealer.getHand().addCard(
            new Card("10", "♠\uFE0F", 10));

        dealer.getHand().addCard(
            new Card("6", "♥\uFE0F", 6));

        assertTrue(dealer.shouldHit());
    }

    /**
     * Tests that the dealer should hit when the hand is exactly 17.
     */
    @Test
    public void testShouldHitAt17() {

        Dealer dealer = new Dealer();

        dealer.getHand().addCard(
            new Card("10", "♠\uFE0F", 10));

        dealer.getHand().addCard(
            new Card("7", "♥\uFE0F", 7));

        assertTrue(dealer.shouldHit());
    }

    /**
     * Tests that the dealer should not hit when the hand is above 17.
     */
    @Test
    public void testShouldHitAbove17() {

        Dealer dealer = new Dealer();

        dealer.getHand().addCard(
            new Card("10", "♠\uFE0F", 10));

        dealer.getHand().addCard(
            new Card("8", "♥\uFE0F", 8));

        assertFalse(dealer.shouldHit());
    }

    /**
     * Tests that clearing the dealer's hand removes all cards.
     */
    @Test
    public void testClearHand() {

        Dealer dealer = new Dealer();

        dealer.getHand().addCard(
            new Card("10", "♠\uFE0F", 10));

        dealer.getHand().addCard(
            new Card("5", "♥\uFE0F", 5));

        assertEquals(15, dealer.getHand().getTotal());

        dealer.clearHand();

        assertEquals(0, dealer.getHand().getTotal());
    }
}