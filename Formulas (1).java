public class Formulas
{
    public static boolean divisibleBy(int a, int b)
    {
        boolean tf = a % b == 0;
        return tf;
    }
    public static void main(String [] args)
    {
        boolean e = divisibleBy(3,9);
        System.out.println(e);
    }
}
