public class A10_CH4
{
    public static int[] columnTotals(int[][] data)
    {
        int[] totals = new int[data[0].length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                totals[j] += data[i][j];
            }
        }
        return totals;
    }
    public static void main(String[] args)
    {
        int[][] data = {{2, 3, 46, 1}, {4, 7, 11, 33}};
        for (int i = 0; i < columnTotals(data).length; i++) {
            System.out.println(columnTotals(data)[i]);
        }
    }
}
