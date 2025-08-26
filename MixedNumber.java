import java.util.Scanner;
public class MixedNumber
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the numerator of the fraction:");
        int numerator = scan.nextInt();
        System.out.println("Enter the denominator of the fraction:\n");
        int denominator = scan.nextInt();
        int fraction = numerator/denominator;
        int remainder = numerator % denominator;
        System.out.printf("The mixed number derived from the fraction " + numerator + "/"
                + denominator + " is " + fraction + " " + remainder + "/" + denominator + ".");
    }
}
