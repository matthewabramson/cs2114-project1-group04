package blackjack;

import java.util.Scanner;

/**
<<<<<<< HEAD
 * Handles user input for the blackjack game.
 * 
 * @author Prabhav Agarwal (prabhav), Jacob Dial (Jacobd06)
 * @version Sep 21, 2026
 */
public class InputHandler
{

=======
 * Handles user input for the Lucky 21 game.
 */
public class InputHandler{
    
    /**
     * Gets the player's bet.
     * Keeps asking until the player enters a whole number.
     *
     * @return the player's bet
     */
>>>>>>> 26240350cb747fe6c0ab719ba74d79b3943bc0e9
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Gets the bet placed by the user
     * 
     * @return the players bet as an integer
     */
    public static int getBet()
    {

        System.out.print("Please Enter Your Bet: $");
        while (!scanner.hasNextInt())
        {
            System.out.println("Please enter a whole number.");
            scanner.next();
            System.out.print("Please Enter Your Bet: $");

        }
        return scanner.nextInt();

    }
<<<<<<< HEAD


    /**
     * Gets the players hit or stay choice
     * 
     * @return choice of the player
     */
    public static String getHitOrStay()
    {
=======
    /**
     * Gets the player's choice to hit or stand.
     * Keeps asking until the player enters hit or stand.
     *
     * @return the player's choice
     */
    public static String getHitOrStay(){
>>>>>>> 26240350cb747fe6c0ab719ba74d79b3943bc0e9
        System.out.print("Hit or Stand?");
        String choice = scanner.next();

        while (!choice.equalsIgnoreCase("hit")
            && !choice.equalsIgnoreCase("stand"))
        {
            System.out.println("Please enter hit or stand.");
            System.out.print("Hit or Stand? ");
            choice = scanner.next();
        }
        return choice;
    }
<<<<<<< HEAD


    /**
     * Gets the players choice to leave or stay
     * 
     * @return choice of the player.
     */
    public static String getPlayAgain()
    {
=======
     /**
     * Gets the player's choice to play again or leave.
     * Keeps asking until the player enters again or leave.
     *
     * @return the player's choice
     */
    public static String getPlayAgain(){
>>>>>>> 26240350cb747fe6c0ab719ba74d79b3943bc0e9
        System.out.print("Play again or leave? ");
        String choice = scanner.next();
        while (!choice.equalsIgnoreCase("again")
            && !choice.equalsIgnoreCase("leave"))
        {
            System.out.println("Please enter again or leave.");
            System.out.print("Play again or leave?");
            choice = scanner.next();
        }
        return choice;
    }
}
