import java.util.Scanner;
public class GuessingGame
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String cheat;
        do {
            System.out.println("Do you want to cheat (Y/N)");
            cheat = scan.next();
        } while (!cheat.equals("Y") && !cheat.equals("N"));
        int i;
        int number = (int) (Math.random()*1000+1);
        if (cheat.equals("Y"))
        {
            number = 0;
            while (number <= 1 || number >= 1000)
            {
                System.out.println("\nEnter the value for the hidden number in the range [1,1000]:");
                number = scan.nextInt();
            }
        }

        System.out.println("I picked a number from 1 to 1000.");
        //System.out.println(number);
        System.out.println("Try to guess it.\n");
        System.out.println("Enter a guess: \n");
        int guess = scan.nextInt();
        for (i = 1; guess != number; i++) {
            if (guess > number)
            {
                System.out.println("Too high, try again.");
            }
            else //if (guess < number)
            {
                System.out.println("Too low, try again.");
            }
            System.out.println("Enter a guess: \n");
            guess = scan.nextInt();
            if (guess == number)
            {
                i++;
                break;
            }
        }
        System.out.println("You got my number in " + (i) + " guesses!");
    }
}
