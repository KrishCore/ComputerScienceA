public class MathSum
{
    public static int summation( int a, int b)
    {
        int c = 0;
        do {
            c+=a;
            a++;
            System.out.println(c);
        } while (a <= b);
        return c;
    }
    public static void main(String[] args)
    {
        System.out.println(summation(4,8));
    }
}
