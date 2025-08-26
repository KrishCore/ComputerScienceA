import java.util.Scanner;
public class PrimeOrNot
{
    public static boolean isFactor(int number, int possibleFactor)
    {
        return number % possibleFactor == 0;
    }
    public static boolean isPrime(int number)
    {
        if (number == 0 || number == 1)
            return false;
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            isPrime = !isFactor(number, i);       //number % i != 0;
            if (!isPrime)
                break;
        }
        return isPrime;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number (larger than 1): ");
        int number = scan.nextInt();
        while (number <= 1)
        {
            System.out.println("Enter a number (larger than 1): ");
            number = scan.nextInt();
        }
        if (isPrime(number))
            System.out.println("\n" + number + " is a prime number.");
        else
            System.out.println("\n" + number + " is not a prime number.");
    }
}
