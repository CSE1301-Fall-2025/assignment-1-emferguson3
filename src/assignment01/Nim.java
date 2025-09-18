import java.util.Scanner;
import java.util.Random;
public class Nim {
 public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    Random rand = new Random();
    System.out.println("How many sticks do you start out with?");
    int sticks = input.nextInt();
    int counter = 0;
`   while(sticks>0){
    System.out.println("Do you want to take 1 or 2 sticks?");
    int take = input.nextInt();
    if(take > 2 || take < 1){
        System.out.println("Round "+counter+": "+sticks+" at start human takes "+take+" , so "+(sticks-take)+" remaain");
        sticks = sticks -take;
    } else {
        System.out.println("Invalid input");
    }
    int random = (rand.nextInt()*2)+1;
    System
    //make sure the code stops when it reaches 0 and make sure the random chooses 1 or 2 at the end when it can and whatever.
}
 }
}
