// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Jacob Dial (Jacobd06)
// LLM Statement:
// // During the preparation of this assignment, I, Jacob Dial used hokieAI in
// assistance for syntax and debugging.
// After using this tool, I reviewed and edited the content as needed to ensure
// its
// accuracy and take full responsibility for the content in relation to grading.
// I understand
// that I am responsible for being able to complete this work without the use of
// assistance.
package blackjack;

import student.TestCase;

/**
 * This class tests the hand class and its stored values
 * 
 * @author Jacob Dial (Jacobd06)
 * @version Sep 20, 2026
 */
public class HandTest
    extends TestCase
{

    private Hand hand;

    /**
     * Sets up a new hand
     */
    public void setUp()
    {
        hand = new Hand();
    }


    /**
     * tests the value of the new hand
     */
    public void testNewHand()
    {
        assertEquals(0, hand.getTotal());
    }


    /**
     * tests the add card method
     */
    public void testAddCard()
    {
        Card card = new Card("5", "♣\uFE0F", 5);

        hand.addCard(card);

        assertEquals(5, hand.getTotal());
    }


    /**
     * tests in case of multiple cards
     */
    public void testMultipleCards()
    {
        hand.addCard(new Card("5", "♦\uFE0F", 5));
        hand.addCard(new Card("7", "♣\uFE0F", 7));

        assertEquals(12, hand.getTotal());
    }


    /**
     * tests the value of face cards
     */
    public void testFaceCards()
    {
        hand.addCard(new Card("King", "♦\uFE0F", 10));
        hand.addCard(new Card("Queen", "♣\uFE0F", 10));

        assertEquals(20, hand.getTotal());
    }


    /**
     * tests case when ace value is eleven
     */
    public void testAceAsEleven()
    {
        hand.addCard(new Card("Ace", "♦\uFE0F", 11));
        hand.addCard(new Card("9", "♣\uFE0F", 9));

        assertEquals(20, hand.getTotal());
    }


    /**
     * Tests case when ace value is one
     */
    public void testAceAsOne()
    {
        hand.addCard(new Card("Ace", "♦\uFE0F", 11));
        hand.addCard(new Card("9", "♣\uFE0F", 9));
        hand.addCard(new Card("5", "♦\uFE0F", 5));

        // 11 + 9 + 5 = 25
        // Ace changes from 11 to 1
        // 1 + 9 + 5 = 15
        assertEquals(15, hand.getTotal());
    }


    /**
     * Tests when they're multiple aces
     */

    public void testMultipleAces()
    {
        hand.addCard(new Card("Ace", "♣\uFE0F", 11));
        hand.addCard(new Card("Ace", "♣\uFE0F", 11));
        hand.addCard(new Card("9", "♦\uFE0F", 9));

        // 11 + 11 + 9 = 31
        // One Ace becomes 1
        // 1 + 11 + 9 = 21
        assertEquals(21, hand.getTotal());
    }


    /**
     * tests when hand value exceeds 21(busts)
     */
    public void testBust()
    {
        hand.addCard(new Card("King", "♦\uFE0F", 10));
        hand.addCard(new Card("Queen", "♦\uFE0F", 10));
        hand.addCard(new Card("5", "♣\uFE0F", 5));

        assertEquals(25, hand.getTotal());
    }
}
