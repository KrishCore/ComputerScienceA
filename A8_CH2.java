public class A8_CH2
{
    public static int[] swap(int[] array, int a, int b)
    {
        int x = array[b];
        array[b] = array[a];
        array[a] = x;
        return array;
    }
    public static void main(String[] args)
    {
        int[] array = {1, 2, 3};
        for (int x: array)
            System.out.print(x);
    }
}
