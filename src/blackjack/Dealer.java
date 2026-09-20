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
