public class A8_CH5
{
    public static double evensTotal(double[] list)
    {
        double sum = 0;
        for (int i = 0; i < list.length; i+=2) {
            sum += list[i];
        }
        return sum;
    }
    public static void main(String[] args)
    {
        double[] list = {1, 1, 1};
        double sum = evensTotal(list);
        System.out.println(sum);
    }
}
