import java.util.Scanner;
public class Circle
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of your circle: \n");
        double radius = scan.nextDouble();
        double circumference = 2*radius*Math.PI;
        double area = radius*radius*Math.PI;
        System.out.println("Circle Properties:");
        System.out.printf("Radius:   %15.3f\n", radius);
        System.out.printf("Circumference: %10.3f\n", circumference);
        System.out.printf("Area:     %15.3f", area);

    }
}
