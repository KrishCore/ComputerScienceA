public class A8_CH4
{
    public static double[] join(double[] list1, double[] list2)
    {
        int length = list1.length+list2.length;
        double[] join = new double[length];
        for (int i = 0; i < list1.length; i++) {
            join[i] = list1[i];
        }
        for (int i = 0; i < list2.length; i++) {
            join[i+list1.length] = list2[i];
        }
        return join;
    }
    public static void main(String[] args)
    {
        double[] list1 = {-2, 2};
        double[] list2 = {1, 2, 3, 4};
        for (int i = 0; i < join(list1, list2).length; i++) {
            System.out.print(join(list1, list2)[i] + ", ");
        }
    }
}
