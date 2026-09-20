package blackjack;

public class Dealer
{

    private Hand hand;

    public Dealer()
    {
        hand = new Hand();
    }


    // start dealer with cards for their hand
    public Hand getHand()
    {
        return hand;
    }


    // when the dealer should keep hitting (if hand is less than 17)
    public boolean shouldHit()
    {
        if (hand.getTotal() <= 17)
        {
            return true;
        }
        return false;
    }


    // clear dealer and when starting a game
    public void clearHand()
    {
        hand.clear();
    }
}
