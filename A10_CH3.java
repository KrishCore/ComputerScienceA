public class A10_CH3
{
    public static int inRange(int[][] values, int goal, int tolerance)
    {
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[0].length; j++) {
                if (values[i][j] >= goal - tolerance && values[i][j] <= goal + tolerance)
                    count++;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        int[][] values = {{4, 6}, {3, 2}};
        int goal = 4;
        int tolerance = 1;
        System.out.println(inRange(values, goal, tolerance));
    }
}
