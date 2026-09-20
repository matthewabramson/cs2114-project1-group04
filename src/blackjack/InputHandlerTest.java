package blackjack;

import student.TestCase;

/**
 * Tests the InputHandler class.
 */
public class InputHandlerTest extends TestCase {

    /**
     * Tests getting a bet from the user.
     */
    public void testGetBet() {
        int bet = InputHandler.getBet();

        assertTrue(bet > 0);
    }

    /**
     * Tests getting the hit or stand choice.
     */
    public void testGetHitOrStay() {
        String choice = InputHandler.getHitOrStay();

        assertTrue(choice.equalsIgnoreCase("hit")
            || choice.equalsIgnoreCase("stand"));
    }

    /**
     * Tests getting the play again choice.
     */
    public void testGetPlayAgain() {
        String choice = InputHandler.getPlayAgain();

        assertTrue(choice.equalsIgnoreCase("again")
            || choice.equalsIgnoreCase("leave"));
    }
}
