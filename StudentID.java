import java.util.Scanner;
public class StudentID
{
    public static String studentID(String firstName, String lastName, int grade, long idNumber)
    {
        return "(" + lastName + ", " + firstName + ") " + idNumber + "/" + grade;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName = scanner.next();
        System.out.println("Enter your last name:");
        String lastName = scanner.next();
        System.out.println("Enter your grade level:");
        int grade = scanner.nextInt();
        System.out.println("Enter your id:");
        long idNumber = scanner.nextLong();
        String a = studentID(firstName, lastName, grade, idNumber);
        System.out.println("\nThe text for your student ID is: ");
        System.out.println(a);

    }
}
