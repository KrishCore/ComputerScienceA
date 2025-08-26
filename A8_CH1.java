public class A8_CH1
{
    public static boolean isFinalEven(int[] list)
    {
        return list[list.length-1] % 2 == 0;
    }

    public static void main(String[] args)
    {
        int[] list = {1, 2, 3, 4};
        for (int x: list)
            System.out.print(x);
        System.out.println(": " + isFinalEven(list));
    }
}
