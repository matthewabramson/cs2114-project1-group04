// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Jacob Dial (Jacobd06)
// LLM Statement:
// // During the preparation of this assignment, I, Jacob Dial used hokieAI in
// assistance for method construction and logic behind place bet.
// After using this tool, I reviewed and edited the content as needed to ensure
// its
// accuracy and take full responsibility for the content in relation to grading.
// I understand
// that I am responsible for being able to complete this work without the use of
// assistance.
package blackjack;

/**
 * Player class stores bankroll and bet
 * 
 * @author Jacob Dial (Jacobd06)
 * @version Sep 20, 2026
 */
public class Player
{

    private Hand hand;
    private int bankroll;
    private int currentBet;

    /**
     * Constructor for player class
     * 
     * @param bankroll
     *            The current bank roll of the player
     */
    public Player(int bankroll)
    {
        this.bankroll = bankroll;
        this.currentBet = 0;
        this.hand = new Hand();
    }


    /**
     * Gets the hand
     * 
     * @return the hand
     */
    public Hand getHand()
    {
        return hand;
    }


    /**
     * Gets the bankroll
     * 
     * @return the bankroll of the player
     */
    public int getBankroll()
    {
        return bankroll;
    }


    /**
     * Gets the current bet
     * 
     * @return the current bet
     */
    public int getCurrentBet()
    {
        return currentBet;
    }


    /**
     * Sets parameters for a valid bet
     * 
     * @return false if invalid
     * @return true if valid
     */
    public boolean placeBet(int bet)
    {
        if ((bet > bankroll) || (bet <= 0))
        {
            System.out.println("Enter valid bet");
            return false;
        }
        else
        {
            currentBet = bet;
            return true;
        }
    }


    /**
     * Adds winnings to the bankroll
     */
    public void addWinnings()
    {
        bankroll += currentBet * 2;
    }


    /**
     * Subtracts bet from bankroll
     */
    public void subtractBet()
    {
        bankroll -= currentBet;
    }


    /**
     * returns bet when push
     */
    public void returnBet()
    {
        bankroll += currentBet;
    }


    /**
     * clears the hands
     */
    public void clearHand()
    {
        hand.clear();
    }
}
