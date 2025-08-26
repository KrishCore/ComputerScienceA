import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scan.nextInt();
        System.out.println("Enter the number of multiples you would like to see for the number " + number + ":");
        int multiples = scan.nextInt();
        while (true)
            if (multiples <= 0) {
                System.out.println("You must enter a positive number for the number of multiples.");
                System.out.println("Enter the number of multiples you would like to see for the number " + number + ":");
                multiples = scan.nextInt();
            }
            else
                break;

        System.out.print("\nThe first " + multiples + " multiples of " + number + " are: ");
        int product;
        int n = 1;
        do {
            product = number * n++;
            if (product == (number * multiples))
                System.out.println(product);
            else
                System.out.print(product + ", ");
        } while (Math.abs(product) < (Math.abs(number) * multiples));



//        Another way to do it.
//        for (int i = 1; i <= multiples; i++)
//        {
//            product = number * i;
//            if (Math.abs(product) == (Math.abs(number) * multiples))
//                System.out.println(product);
//            else
//                System.out.print(product + ", ");
//        }
    }
}
