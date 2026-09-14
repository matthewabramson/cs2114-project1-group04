
import java.util.Scanner;


public class InputHandler{

    private static Scanner scanner = new Scanner(System.in);

    public static int getBet(){

        System.out.print("Please Enter Your Bet: $");

        int bet = scanner.nextInt();
        return bet;

    }



}
