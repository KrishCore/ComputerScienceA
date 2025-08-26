public class Summation
{
    public static int summation(int a, int b)
    {
        System.out.println(a + "" + b);
        if (a >= b)
            return a;
        else return a + summation(a+1, b);
    }
    public static void main(String[] args)
    {
        System.out.println(summation(2,5));
    }
}
