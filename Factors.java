import java.util.Scanner;
public class Factors
{
    public static boolean isFactor(int number, int possibleFactor)
    {
        return number % possibleFactor == 0;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What number do you want to see the factors of (Positive Number)?");
        int number = scan.nextInt();
        while (number <= 0) {
            System.out.println("What number do you want to see the factors of (Positive Number)?");
            number = scan.nextInt();
            if (number > 0)
                break;
        }
        int possibleFactor = 1;
        System.out.print("\nThe factors of " + number + " are: ");
        do {
            if (possibleFactor == number)
                System.out.print(possibleFactor + ".");
            else if (number % possibleFactor == 0)
                System.out.print(possibleFactor + ", ");

            possibleFactor++;
        } while (possibleFactor <= number);
    }
}
