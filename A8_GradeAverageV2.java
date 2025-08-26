import java.util.Scanner;
public class A8_GradeAverageV2
{
    public static char gradeLetter(double[] grades)
    {
        double average = average(grades);
        char gradeLetter = '!';
        if (average >= 90)
            gradeLetter = 'A';
        else if (average >= 80)
            gradeLetter = 'B';
        else if (average >= 75)
            gradeLetter ='C';
        else if (average >= 70)
            gradeLetter = 'D';
        else if (average < 70)
            gradeLetter = 'F';
        return gradeLetter;
    }
    public static double average(double[] grades)
    {
        double sum = 0;
        for (double grade : grades)
            sum += grade;
        return sum/grades.length;
    }
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many grades does the student have?");
        int numberOfGrades = scan.nextInt();
        double[] grades = new double[numberOfGrades];
        for (int i = 0; i < numberOfGrades; i++) {
            System.out.println("Enter grade " + (i+1) + ":");
            double grade = scan.nextDouble();
            grades[i] = grade;
        }
        System.out.printf("\nThe student's average is %.2f.", average(grades));
        System.out.println("\nThe student's grade letter is a(n) " + gradeLetter(grades) + ".");
    }
}
