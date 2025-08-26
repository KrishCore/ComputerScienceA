import java.util.Scanner;
public class Cylinder
{
    public static double surfaceArea(double r, double h)
    {
        return (2* Math.pow(r, 2) *Math.PI) + 2*Math.PI*r*h;
    }
    public static double volume(double r, double h)
    {
        return Math.pow(r, 2)*Math.PI*h;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of your cylinder:");
        double r = scan.nextDouble();
        System.out.println("Enter the height of your cylinder:");
        double h = scan.nextDouble();
        double a = surfaceArea(r, h);
        double b = volume(r, h);
        System.out.println("\nCylinder Properties:");
        System.out.printf("Radius:%18.3f\n", r);
        System.out.printf("Height:%18.3f\n", h);
        System.out.printf("Surface Area:%12.3f\n", a);
        System.out.printf("Volume:%18.3f\n", b);
    }
}
