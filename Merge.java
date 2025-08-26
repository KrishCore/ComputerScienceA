public class Merge
{
    public static int  digitsTotal (int number)
    {
        int sum = 0;
        do {
            sum += number % 10;
            number/=10;
        }while (number>0);
        return sum;
    }
    public static void main(String[] args)
    {
        System.out.println(digitsTotal(123));
    }
}
