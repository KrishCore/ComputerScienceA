public class Range
{
    public static boolean inRange( int num1, int num2, int allowedRange)
    {
        return (num1 - num2 <= allowedRange && num1 - num2 >= 0) || (num2 - num1 <= allowedRange && num2 - num1 >= 0);
    }
    public static void main(String[] args)
    {
        System.out.println(inRange(5,9,3));
    }
}
