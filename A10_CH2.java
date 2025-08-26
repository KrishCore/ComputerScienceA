public class A10_CH2
{
    public static int positiveCount(int[][] data)
    {
        int positiveCount = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                if (data[i][j] > 0 )
                    positiveCount++;
            }
        }
        return positiveCount;
    }
    public static void main(String[] args)
    {
        int[][] data = {{1, 1}, {1, 1}};
        System.out.println(positiveCount(data));
    }
}
