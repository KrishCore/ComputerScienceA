import java.util.Scanner;

public class LineLab
{
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    public double getX1()
    {
        return x1;
    }
    public double getY1()
    {
        return y1;
    }
    public double getX2()
    {
        return x2;
    }
    public double getY2()
    {
        return y2;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter point one...");
        System.out.println("Enter the x value:");
        double x1 = scan.nextDouble();
        System.out.println("Enter the y value:");
        double y1 = scan.nextDouble();
        MyPoint p1 = new MyPoint(x1,y1);
        System.out.println("\nEnter point two...");
        System.out.println("Enter the x value:");
        double x2 = scan.nextDouble();
        System.out.println("Enter the y value:");
        double y2 = scan.nextDouble();
        MyPoint p2 = new MyPoint(x2,y2);
        MyLine m1 = new MyLine(p1, p2);

        int selection;
        do {
            System.out.println("\n-Main Menu-\n" +
                    "1. Replace Line\n" +
                    "2. Change Point 1\n" +
                    "3. Change Point 2\n" +
                    "4. View line Information\n" +
                    "5. Exit\n" +
                    "Enter selection:\n");
            selection = scan.nextInt();
            if (selection < 1 || selection > 5)
                System.out.println("\nInvalid input");
            else if (selection == 1)
            {
                System.out.println("Enter point one...");
                System.out.println("Enter the x value:");
                x1 = scan.nextDouble();
                System.out.println("Enter the y value:");
                y1 = scan.nextDouble();
                p1 = new MyPoint(x1,y1);
                System.out.println("\nEnter point two...");
                System.out.println("Enter the x value:");
                x2 = scan.nextDouble();
                System.out.println("Enter the y value:");
                y2 = scan.nextDouble();
                p2 = new MyPoint(x2,y2);
                m1 = new MyLine(p1, p2);
            }
            else if (selection == 2)
            {
                System.out.println("Enter the new point one...");
                System.out.println("Enter the x value:");
                x1 = scan.nextDouble();
                System.out.println("Enter the y value:");
                y1 = scan.nextDouble();
                p1 = new MyPoint(x1,y1);
                m1 = new MyLine(p1, p2);
            }
            else if (selection == 3)
            {
                System.out.println("Enter the new point two...");
                System.out.println("Enter the x value:");
                x2 = scan.nextDouble();
                System.out.println("Enter the y value:");
                y2 = scan.nextDouble();
                p2 = new MyPoint(x2,y2);
                m1 = new MyLine(p1, p2);
            }
            else if (selection == 4)
            {
                System.out.println("Line Data:");
                System.out.println(m1);
            }
            else //if (selection == 5)
            {
                System.out.println("Goodbye.");
                break;
            }
        } while (true);
    }
}
