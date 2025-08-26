public class Calculations
{
    public static int minimum ( int num1, int num2, int num3)
    {
        return Math.min(Math.min(num1, num2), num3);
    }
    public static void main(String[] args)
    {
        int a = minimum(1, 2, 3);
        System.out.println(a);
    }
}
