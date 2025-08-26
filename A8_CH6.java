public class A8_CH6
{
    public static int[] sumArrays(int[] list1, int[] list2)
    {
        int[] sumArrays = new int[list1.length];
        for (int i = 0; i < list1.length; i++) {
            sumArrays[i] = list1[i] + list2[i];
        }
        return sumArrays;
    }
    public static void main(String[] args)
    {
        int[] list1 = {6, 2};
        int[] list2 = {8, 7};
        for (int i = 0; i < sumArrays(list1, list2).length; i++) {
            System.out.print(sumArrays(list1, list2)[i] + ", ");
        }

    }
}
