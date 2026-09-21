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

/**
 * Represents the dealer in the Lucky 21 game.
 * The dealer has a hand and decides when to hit.
 */
public class Dealer
{

    private Hand hand;

    /**
     * Creates a new dealer with an empty hand.
     */
    public Dealer()
    {
        hand = new Hand();
    }


    /**
     * Gets the dealer's hand.
     *
     * @return the dealer's hand
     */
    public Hand getHand()
    {
        return hand;
    }


    /**
     * Determines whether the dealer should hit.
     * The dealer hits when the hand total is 17 or less.
     *
     * @return true if the dealer should hit, false otherwise
     */
    public boolean shouldHit()
    {
        if (hand.getTotal() <= 17)
        {
            return true;
        }
        return false;
    }


    /**
     * Clears all cards from the dealer's hand.
     */
    public void clearHand()
    {
        hand.clear();
    }
}
