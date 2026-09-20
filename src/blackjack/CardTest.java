package blackjack;

public class CardTest
    extends student.TestCase
{
    private Card card1;
    private Card card2;

    public void setUp()
    {
        card1 = new Card("Ace", "♠\uFE0F", 11);
        card2 = new Card("10", "♥\uFE0F", 10);
    }


    /**
     * Test the Card get rank method
     */
    public void testGetRank()
    {
        assertEquals(card1.getRank(), "Ace");
        assertEquals(card2.getRank(), "10");
    }

//
    /**
     * Test the Card get value method.
     */
    public void testGetValue()
    {
        assertEquals(card1.getValue(), 11);
        assertEquals(card2.getValue(), 10);
    }


    /** 
     * Test the Card get suit method.
     */
    public void testGetSuit()
    {
        assertEquals(card1.getSuit(), "♠\uFE0F");
        assertEquals(card2.getSuit(), "♥\uFE0F");
    }

}
