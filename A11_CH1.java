import java.util.ArrayList;
public class A11_CH1
{
    public static int totals(ArrayList<Integer> numbers)
    {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        return sum;
    }
}
