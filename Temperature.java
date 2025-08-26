import java.util.Scanner;

public class Temperature
{
    public static double celToFah(double cel)
    {
        return (9 * cel)/5 + 32;
    }
    public static double fahToCel(double fah)
    {
        return (fah - 32) * 5/9;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("---Menu---");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("Enter your selection:");
        double selection = scan.nextDouble();
        if (selection == 1) {
            System.out.println("\nEnter your temperature in Celsius:");
            double cel = scan.nextDouble();
            System.out.printf("\n%.2f degrees in Celsius is %.2f degrees in Fahrenheit.", cel, celToFah(cel));
        }
        else if (selection == 2) {
            System.out.println("\nEnter your temperature in Fahrenheit:");
            double fah = scan.nextDouble();
            System.out.printf("\n%.2f degrees in Fahrenheit is %.2f degrees in Celsius.", fah, fahToCel(fah));
        }
    }
}
