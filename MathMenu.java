import java.util.Scanner;
public class MathMenu
{
    public static void printMenu()
    {
        System.out.println("\nMenu\n1. Power\n2. Square\n3. Square root\n4. Exit\nEnter selection:");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int selection;
        do {
            printMenu();
            selection = scan.nextInt();
            if (selection < 1 || selection > 4)
                System.out.println("\nInvalid input");
            else if (selection == 1)
            {
                System.out.println("\nEnter the base of the power:");
                double base = scan.nextDouble();
                System.out.println("Enter the exponent of the power:");
                double exponent = scan.nextDouble();
                System.out.printf("%.2f^%.2f = %.2f\n", base, exponent, Math.pow(base, exponent));
            }
            else if (selection == 2)
            {
                System.out.println("\nEnter the value to be squared:");
                double base  = scan.nextDouble();
                System.out.printf("%.2f^2 = %.2f\n", base, Math.pow(base, 2));
            }
            else if (selection == 3)
            {
                System.out.println("\nEnter the value for the square root:");
                double base = scan.nextDouble();
                System.out.printf("%.2f^.5 = %.2f\n", base, Math.sqrt(base));
            }
            else if (selection == 4)
            {
                System.out.println("\nGood Bye.");
                break;
            }
        } while (selection !=4);
    }
}
