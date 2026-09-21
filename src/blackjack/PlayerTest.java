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

/*
 * @author Jacob Dial (Jacobd06)
 * @version Sep 20, 2026
 */
public class PlayerTest
    extends TestCase
{
    private Player player;

    /**
     * sets up new player
     */
    public void setUp()
    {
        player = new Player(1000);
    }


    /**
     * tests all fields of the constructor
     */
    public void testConstructor()
    {
        assertEquals(100, player.getBankroll());
        assertEquals(0, player.getCurrentBet());
        assertNotNull(player.getHand());
    }


    /**
     * tests the get hand method
     */
    public void testGetHand()
    {
        Hand hand = player.getHand();
        assertNotNull(hand);
        assertEquals(0, hand.getTotal());
    }


    /**
     * Tests the get bankroll method
     */
    public void testGetBankroll()
    {
        assertEquals(100, player.getBankroll());
    }


    public void testCurrentBet()
    {
        assertEquals(0, player.getCurrentBet());
    }


    /**
     * tests the valid bet method
     */
    public void testPlaceValidBet()
    {
        assertTrue(player.placeBet(25));
        assertEquals(25, player.getCurrentBet());
        assertEquals(100, player.getBankroll());
    }


    /**
     * tests bets that are equal to the player's bankroll.
     */
    public void testPlaceBetEqualToBankroll()
    {
        assertTrue(player.placeBet(100));
        assertEquals(100, player.getCurrentBet());
        assertEquals(100, player.getBankroll());
    }


    /**
     * tests bets that are over the player's bankroll.
     */
    public void testPlaceBetToBig()
    {
        assertFalse(player.placeBet(101));
        assertEquals(0, player.getCurrentBet());
        assertEquals(100, player.getBankroll());
    }


    /**
     * tests bets placed that are zero
     */
    public void testPlaceBetZero()
    {
        assertFalse(player.placeBet(0));
        assertEquals(0, player.getCurrentBet());
    }


    /**
     * tests bets placed that are negative
     */
    public void testPlaceBetNegative()
    {
        assertFalse(player.placeBet(-10));
        assertEquals(0, player.getCurrentBet());
    }


    /**
     * tests the add winnings method
     */
    public void testAddWinnings()
    {
        player.placeBet(25);
        player.addWinnings();
        assertEquals(150, player.getBankroll());
    }


    /**
     * tests the subtract bet method
     */
    public void testSubtractBet()
    {
        player.placeBet(25);
        player.subtractBet();
        assertEquals(75, player.getBankroll());
    }


    /**
     * tests another kind of bet.
     */
    public void testAnotherBet()
    {
        player.placeBet(50);
        assertEquals(50, player.getCurrentBet());
        player.addWinnings();
        assertEquals(200, player.getBankroll());
    }
}
