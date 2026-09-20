// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Jacob Dial (Jacobd06)
// LLM Statement:
// // During the preparation of this assignment, I, Jacob Dial used hokieAI in
// assistance for method construction.
// After using this tool, I reviewed and edited the content as needed to ensure
// its
// accuracy and take full responsibility for the content in relation to grading.
// I understand
// that I am responsible for being able to complete this work without the use of
// assistance.
package blackjack;

import java.util.ArrayList;

/**
 * Hand Class stores the cards.
 * 
 * @author Jacob Dial (Jacobd06)
 * @version Sep 20, 2026
 */
public class Hand
{

    private ArrayList<Card> cards;

    /**
     * Hand class constructor
     */
    public Hand()
    {
        cards = new ArrayList<Card>();
    }


    /**
     * Adds a card to the hand.
     * 
     * @param card
     *            card to be added
     */
    public void addCard(Card card)
    {
        cards.add(card);
    }


    /**
     * Gets card at the given index.
     * 
     * @param index
     *            index of card
     */
    public Card getCard(int index)
    {
        return cards.get(index);
    }


    /**
     * Clears the hand.
     */
    public void clear()
    {
        cards.clear();
    }


    /**
     * Calculates total of the hand.
     * 
     * @return the total of hand
     */
    public int getTotal()
    {
        int total = 0;
        int aces = 0;

        for (Card card : cards)
        {
            total += card.getValue();

            if (card.getRank().equals("Ace"))
            {
                aces++;
            }
        }

        // Change Aces from 11 to 1 if the hand would bust
        while (total > 21 && aces > 0)
        {
            total -= 10;
            aces--;
        }

        return total;
    }
}
