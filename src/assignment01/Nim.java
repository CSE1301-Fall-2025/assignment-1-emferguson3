import java.util.Scanner;
import java.util.Random;

public class Nim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("How many sticks do you start out with?");
        int sticks = input.nextInt();
        int counter = 0;
        boolean win = true;
        while (sticks > 0) {
            System.out.println("Do you want to take 1 or 2 sticks?");
            int take = input.nextInt();
            if (take <= 2 && take >= 1) {
                System.out.println("Round " + counter + ": " + sticks + " at start human takes " + take + " , so "
                        + (sticks - take) + " remain");
                sticks = sticks - take;
            } else {
                System.out.println("Invalid input");
            }
            counter++;
            if (sticks > 2) {
                int random = (rand.nextInt(2) + 1);
                System.out.println("Round " + counter + ": " + sticks + " at start computer takes " + random + " , so "
                        + (sticks - random) + " remain");
                sticks = sticks - random;
            } else if (sticks == 2) {
                System.out.println("Round " + counter + ": " + sticks + " at start computer takes 2 so 0 remain");
                sticks = sticks - 2;
                win = false;
            } else if (sticks == 1) {
                System.out.println("Round " + counter + ": " + sticks + " at start computer takes 1 so 0 remain");
                sticks = sticks - 1;
                win = false;
            }
            counter++;
        }
        if (win) {
            System.out.println("You won!");
        } else {
            System.out.println("The computer won, better luck next time :(");
        }
        input.close();

    }
}
