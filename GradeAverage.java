import java.util.Scanner;
public class GradeAverage
{
    public static char gradeLetter(double average)
    {
        if (average <= 100 && average >=90)
            return 'A';
        else if (average < 90 && average >= 80)
            return 'B';
        else if (average < 80 && average >= 75)
            return 'C';
        else if (average < 75 && average >= 70)
            return 'D';
        else
            return 'F';
    }
    public static char gradeLetter(double grade1, double grade2, double grade3, double grade4)
    {
        double average = (grade1 + grade2 + grade3 + grade4)/4;
        if (average <= 100 && average >=90)
            return 'A';
        else if (average < 90 && average >= 80)
            return 'B';
        else if (average < 80 && average >= 75)
            return 'C';
        else if (average < 75 && average >= 70)
            return 'D';
        else
            return 'F';
    }
    public static double average(double grade1, double grade2,double grade3, double grade4)
    {
        return (grade1 + grade2 + grade3 + grade4)/4;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter grade one:");
        double grade1 = scan.nextDouble();
        System.out.println("Enter grade two:");
        double grade2 = scan.nextDouble();
        System.out.println("Enter grade three:");
        double grade3 = scan.nextDouble();
        System.out.println("Enter grade four:");
        double grade4 = scan.nextDouble();
        double average = average(grade1, grade2, grade3, grade4);
        System.out.printf("\nYour average is %.2f.", average);
        System.out.println("\nYou have a(n) " + gradeLetter(grade1, grade2, grade3, grade4) + ".");
    }
}
