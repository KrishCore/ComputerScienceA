public class Adjustments
{
    public static int roundedSum(int num1, int num2, int num3)
    {
        int a = 7;
        int sum = num1 + num2 + num3;
        if (sum % 10 == 0)
            a = sum;
        else if ((sum + 1) % 10 == 0)
            a = sum + 1;
        else if ((sum - 1) % 10 == 0)
            a = sum - 1;
        else if ((sum + 2) % 10 == 0)
            a = sum + 2;
        else if ((sum - 2) % 10 == 0)
            a = sum - 2;
        else if ((sum + 3) % 10 == 0)
            a = sum + 3;
        else if ((sum - 3) % 10 == 0)
            a = sum - 3;
        else if ((sum + 4) % 10 == 0)
            a = sum + 4;
        else if ((sum - 4) % 10 == 0)
            a = sum - 4;
        else if ((sum + 5) % 10 == 0)
            a = sum + 5;
        else if ((sum - 5) % 10 == 0)
            a = sum - 5;
        else if ((sum + 6) % 10 == 0)
            a = sum + 6;
        else if ((sum - 6) % 10 == 0)
            a = sum - 6;
        else if ((sum + 7) % 10 == 0)
            a = sum + 7;
        else if ((sum - 7) % 10 == 0)
            a = sum - 7;
        else if ((sum + 8) % 10 == 0)
            a = sum + 8;
        else if ((sum - 8) % 10 == 0)
            a = sum - 8;
        else if ((sum + 9) % 10 == 0)
            a = sum + 9;
        else if ((sum - 9) % 10 == 0)
            a = sum - 9;
        return a;
    }
    public static void main(String[] args)
    {
      int roundedSum = roundedSum(5, 6, 0);
        System.out.println();
        System.out.println(roundedSum);
    }
}
