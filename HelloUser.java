import java.util.Scanner;
public class HelloUser
{
    public static void main(String[] args)
    {
        String name;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = scan.next();
        System.out.println("\nHello " + name + ".");
        int a = 7/5 + 3;
        System.out.println(a);
    }
}