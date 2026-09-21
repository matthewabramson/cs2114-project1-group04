// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Rudra Dutta (drudra)
// LLM Statement:
// // During the preparation of this assignment, I, Rudra Dutta used hokieAI in
// assistance for syntax and debugging.
// After using this tool, I reviewed and edited the content as needed to ensure
// its
// accuracy and take full responsibility for the content in relation to grading.
// I understand
// that I am responsible for being able to complete this work without the use of
// assistance.
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