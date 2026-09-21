package blackjack;

import java.util.Scanner;

/**
 * Handles user input for the blackjack game.
 * 
 * @author Prabhav Agarwal (prabhav), Jacob Dial (Jacobd06)
 * @version Sep 21, 2026
 */
public class InputHandler
{

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


    /**
     * Gets the players hit or stay choice
     * 
     * @return choice of the player
     */
    public static String getHitOrStay()
    {
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


    /**
     * Gets the players choice to leave or stay
     * 
     * @return choice of the player.
     */
    public static String getPlayAgain()
    {
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
