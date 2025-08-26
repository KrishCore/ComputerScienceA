import java.util.Scanner;
public class Rectangle
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int width, length;
        System.out.println("Enter the length (whole number):");
        length = scan.nextInt();
        System.out.println("Enter the width (whole number):\n");
        width = scan.nextInt();
        int perimeter = (2*width+2*length);
        int area = (width*length);
        System.out.println("Rectangle properties:");
        System.out.println("Length    - " + length);
        System.out.println("Width     - " + width);
        System.out.println("Perimeter - " + perimeter);
        System.out.println("Area      - " + area);
    }
}
