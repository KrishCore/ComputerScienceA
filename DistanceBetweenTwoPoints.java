import java.util.Scanner;
public class DistanceBetweenTwoPoints
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the x value of your first point (Whole Number):");
        double x1 = scan.nextDouble();
        System.out.println("Enter the y value of your first point (Whole Number):");
        double y1 = scan.nextDouble();
        System.out.println("Enter the x value of your second point (Whole Number):");
        double x2 = scan.nextDouble();
        System.out.println("Enter the y value of your second point (Whole Number):\n");
        double y2 = scan.nextDouble();
        double dx = Math.pow(x2 - x1, 2);
        double dy = Math.pow(y2 - y1, 2);
        double d = Math.sqrt(dx + dy);
        System.out.printf("The distance between (%.2f,%.2f) and " +
                "(%.2f,%.2f) is %.2f.", x1, y1, x2, y2, d);
    }
}
