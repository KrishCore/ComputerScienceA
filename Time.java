import java.util.Scanner;
public class Time
{
    public static boolean isLeapYear (int year)
    {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year (whole number):");
        int year = scan.nextInt();
        if (isLeapYear(year))
            System.out.println("\n" + year + " is a leap year.");
        else
            System.out.println("\n" + year + " is not a leap year.");
    }
}
