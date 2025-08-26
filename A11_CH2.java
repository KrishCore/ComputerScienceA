import java.util.ArrayList;
public class A11_CH2
{
    public static double average(ArrayList<Double> numbers)
    {
        double sum = 0;
        for(int i = 0; i < numbers.size(); i++){
            sum += numbers.get(i);
        }
        return sum/numbers.size();
    }
    public static void main(String[] args)
    {
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(3.8);
        numbers.add(4.6);
        numbers.add(0.0);
        numbers.add(99.0);
        System.out.println(average(numbers));
    }
}
