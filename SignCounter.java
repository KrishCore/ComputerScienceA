import java.util.Scanner;
public class SignCounter
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        do {
            System.out.println("Enter a whole number (0 to quit): ");
            int number = scan.nextInt();
            if (number < 0)
                negative++;
            else if (number > 0)
                positive++;
            else
                break;
        } while (true);
        if (positive == 0 && negative == 0)
            System.out.println("\nYou entered " + (positive) + " positive numbers and " + (negative) + " negative numbers.");
        else if (positive == 0 && negative == 1)
            System.out.println("\nYou entered " + (positive) + " positive numbers and " + (negative) + " negative number.");
        else if (positive == 0 && negative > 1)
            System.out.println("\nYou entered " + (positive) + " positive numbers and " + (negative) + " negative numbers.");
        else if (positive == 1 && negative == 0)
            System.out.println("\nYou entered " + (positive) + " positive number and " + (negative) + " negative numbers.");
        else if (positive == 1 && negative == 1)
            System.out.println("\nYou entered " + (positive) + " positive number and " + (negative) + " negative number.");
        else if (positive == 1 && negative > 1)
            System.out.println("\nYou entered " + (positive) + " positive number and " + (negative) + " negative numbers.");
        else if (positive > 1 && negative == 0)
            System.out.println("\nYou entered " + (positive) +" positive numbers and " + (negative) + " negative numbers.");
        else if (positive > 1 && negative == 1)
            System.out.println("\nYou entered " + (positive) +" positive numbers and " + (negative) + " negative number.");
        else if (positive > 1 && negative > 1)
            System.out.println("\nYou entered " + (positive) +" positive numbers and " + (negative) + " negative numbers.");

    }
}
