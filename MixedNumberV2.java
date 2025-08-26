import java.util.Scanner;
public class MixedNumberV2
{
    public static int wholeNumber(int numerator, int denominator)
    {
        return numerator/denominator;
    }
    public static int remainder(int numerator, int denominator)
    {
        return numerator % denominator;
    }
    public static String fraction(int numerator, int denominator)
    {
        return (numerator % denominator) + "/" + denominator;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the numerator of your fraction (Whole Number):");
        int numerator = scan.nextInt();
        System.out.println("Enter the denominator of your fraction (Whole Number):");
        int denominator = scan.nextInt();
        if (fraction(numerator, denominator).equals("0/" + denominator))
            System.out.println("\nThe whole number derived from the fraction " + numerator + "/" + denominator + " is " +wholeNumber(numerator,denominator) + ".");
        else
            System.out.println("\nThe mixed number derived from the fraction " + numerator + "/" + denominator + " is " +wholeNumber(numerator,denominator) + " " + fraction(numerator, denominator) + ".");
    }
}
