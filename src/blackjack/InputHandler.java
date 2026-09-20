package blackjack;
import java.util.Scanner;


public class InputHandler{

    private static Scanner scanner = new Scanner(System.in);

    public static int getBet(){

        System.out.print("Please Enter Your Bet: $");
        while (!scanner.hasNextInt()){
            System.out.println("Please enter a whole number.");
            scanner.next();
            System.out.print("Please Enter Your Bet: $");

        }
        return scanner.nextInt();

    }
    public static String getHitOrStay(){
        System.out.print("Hit or Stand?");
        String choice = scanner.next();

        while (!choice.equalsIgnoreCase("hit")
               && !choice.equalsIgnoreCase("stand")){
            System.out.println("Please enter hit or stand.");
            System.out.print("Hit or Stand? ");
            choice = scanner.next();
        }
        return choice;
    }
    public static String getPlayAgain(){
        System.out.print("Play again or leave? ");
        String choice = scanner.next();
        while (!choice.equalsIgnoreCase("again")
               && !choice.equalsIgnoreCase("leave")){
            System.out.println("Please enter again or leave.");
            System.out.print("Play again or leave?");
            choice = scanner.next();
        }
        return choice;
    }
}
