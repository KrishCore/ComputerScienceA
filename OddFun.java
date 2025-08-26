public class OddFun
{
    public static int oddTotal(int end)
    {
        int sum = 0;
        if (end % 2 == 0) {
            end++;
            do {
                end -= 2;
                sum += end;
            } while (end > 0);
            return sum + 1;
        }
        else {
            end = end + 2;
            do {
                end -= 2;
                sum += end;
            } while (end > 0);
            return sum + 1;
        }
    }
    public static void main(String[] args)
    {
        System.out.println(oddTotal(13));
    }
}
