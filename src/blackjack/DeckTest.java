package blackjack;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Tests the Deck class.
 * 
 * @author Prabhav Agarwal (prabhav), Jacob Dial (Jacobd06)
 * @version Sep 21, 2026
 */
public class DeckTest
{

    /**
     * Tests that a new deck is not empty.
     */
    @Test
    public void testNewDeck()
    {
        Deck deck = new Deck();

        assertFalse(deck.isEmpty());
    }


    /**
     * Tests that dealing a card returns a Card.
     */
    @Test
    public void testDealCard()
    {
        Deck deck = new Deck();

        Card card = deck.dealCard();

        assertNotNull(card);
    }


    /**
     * Tests that dealing cards removes them from the deck.
     */
    @Test
    public void testDealCardRemovesCard()
    {
        Deck deck = new Deck();

        int cardsDealt = 0;

        while (cardsDealt < 416)
        {
            assertNotNull(deck.dealCard());
            cardsDealt++;
        }

        assertTrue(deck.isEmpty());
    }


    /**
     * Tests that dealing from an empty deck returns null.
     */
    @Test
    public void testDealEmptyDeck()
    {
        Deck deck = new Deck();

        for (int i = 0; i < 416; i++)
        {
            deck.dealCard();
        }

        assertTrue(deck.isEmpty());
        assertNull(deck.dealCard());
    }


    /**
     * Tests that shuffle can be called on the deck.
     */
    @Test
    public void testShuffle()
    {
        Deck deck = new Deck();

        deck.shuffle();

        assertFalse(deck.isEmpty());
    }


    /**
     * Tests that the cards have the correct values.
     */
    @Test
    public void testCardValues()
    {
        Deck deck = new Deck();

        Card ace = null;
        Card numberCard = null;
        Card faceCard = null;

        // Look through the deck until each type of card is found.
        for (int i = 0; i < 416; i++)
        {
            Card card = deck.dealCard();

            if (card.getRank().equals("Ace"))
            {
                ace = card;
            }
            else if (card.getRank().equals("5"))
            {
                numberCard = card;
            }
            else if (card.getRank().equals("K"))
            {
                faceCard = card;
            }
        }

        assertNotNull(ace);
        assertNotNull(numberCard);
        assertNotNull(faceCard);

        assertEquals(11, ace.getValue());
        assertEquals(5, numberCard.getValue());
        assertEquals(10, faceCard.getValue());
    }
}
