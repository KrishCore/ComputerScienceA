public class A8_CH3
{
    public static boolean contains(int [] nums, int value)
    {
        boolean b = false;
        for (int x: nums)
            if (value == x)
                b = true;
        return b;
    }
    public static void main(String[] args)
    {
        int[] nums = {2, 4, 5};
        int x = 4;
        for (int c : nums)
            System.out.print(c);
        System.out.println(": " + contains(nums, x));

    }
}
