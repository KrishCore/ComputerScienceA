public class A10_CH6
{
    public static int[][] averageCells(int[][] data)
    {
        int average;
        int[][] array = new int[data.length][data[0].length];
        for (int rows = 0; rows < array.length; rows++) {
            for (int cols = 0; cols < array[rows].length; cols++) {
                if (data.length > 1 && data[rows].length > 1) {
//                    first row
                    if (rows == 0) {
                        if (cols == 0) {
                            average = (data[rows][cols] + data[rows + 1][cols] + data[rows + 1][cols + 1] + data[rows][cols + 1]) / 4;
                            array[rows][cols] = average;
                        } else if (cols == data[rows].length - 1) {
                            average = (data[rows][cols] + data[rows + 1][cols] + data[rows + 1][cols - 1] + data[rows][cols - 1]) / 4;
                            array[rows][cols] = average;
                        } else {
                            average = (data[rows][cols - 1] + data[rows][cols] + data[rows][cols + 1] +
                                    data[rows + 1][cols - 1] + data[rows + 1][cols] + data[rows + 1][cols + 1]) / 6;
                            array[rows][cols] = average;
//                            1\  2\  0/     (12)/6
//                            4\ -1\  6
                        }
                    }
//                    last row
                    else if (rows == data.length - 1) {
                        if (cols == 0) {
                            average = (data[rows][cols] + data[rows - 1][cols] + data[rows - 1][cols + 1] + data[rows][cols + 1]) / 4;
                            array[rows][cols] = average;
                        } else if (cols == data[rows].length - 1) {
                            average = (data[rows][cols] + data[rows - 1][cols] + data[rows - 1][cols - 1] + data[rows][cols - 1]) / 4;
                            array[rows][cols] = average;
                        } else {
                            average = (data[rows][cols] + data[rows - 1][cols] + data[rows - 1][cols - 1] +
                                    data[rows][cols - 1] + data[rows - 1][cols + 1] + data[rows][cols + 1]) / 6;
                            array[rows][cols] = average;
//                            1/  2/  0
//                            4/ -1/  6
                        }
                    }
//                    first column
                    else if (cols == 0) {
                        average = (data[rows - 1][cols] + data[rows - 1][cols + 1] +
                                data[rows][cols] + data[rows][cols + 1] + data[rows + 1][cols] + data[rows + 1][cols + 1]) / 6;
                        array[rows][cols] = average;
//                            {X,X,0}
//                            {X,X,0}
//                            {X,X,0}
                    }
//                    last column
                    else if (cols == data[rows].length - 1) {
                        average = (data[rows - 1][cols - 1] + data[rows - 1][cols] +
                                data[rows][cols] + data[rows][cols - 1] + data[rows + 1][cols] + data[rows + 1][cols - 1]) / 6;
                        array[rows][cols] = average;
//                            {0,X,X}
//                            {0,X,X}
//                            {0,X,X}
                    }
//                    middle
                    else {
                        average = (data[rows - 1][cols - 1] + data[rows - 1][cols] + data[rows - 1][cols + 1] +
                                data[rows][cols - 1] + data[rows][cols] + data[rows][cols + 1] +
                                data[rows + 1][cols - 1] + data[rows + 1][cols] + data[rows + 1][cols + 1]) / 9;
                        array[rows][cols] = average;
                    }
                }
                else if (data.length == 1 && data[0].length > 1) {
                    if (cols == 0) {
                        average = (data[rows][cols] + data[rows][cols + 1]) / 2;
                        array[rows][cols] = average;
                    } else if (cols == data[0].length - 1) {
                        average = (data[rows][cols] + data[rows][cols - 1]) / 2;
                        array[rows][cols] = average;
                    } else {
                        average = (data[rows][cols - 1] + data[rows][cols] + data[rows][cols + 1]) / 3;
                        array[rows][cols] = average;
                    }
                }
                else if (data[0].length == 1 && data.length > 1) {
                    if (rows == 0) {
                        average = (data[rows][cols] + data[rows + 1][cols]) / 2;
                        array[rows][cols] = average;
                    } else if (rows == data.length - 1) {
                        average = (data[rows - 1][cols] + data[rows][cols]) / 2;
                        array[rows][cols] = average;
                    } else {
                        average = (data[rows - 1][cols] + data[rows][cols] + data[rows + 1][cols]) / 3;
                        array[rows][cols] = average;
                    }
                }
            }
        }
        return array;
    }
    public static void main(String[] args)
    {
        int[][] data = {{1,2,0},
                        {4,-1,6}};
        for (int i = 0; i < averageCells(data).length; i++) {
            for (int j = 0; j < averageCells(data)[i].length; j++) {
                System.out.print(averageCells(data)[i][j] + " ");
            }
            System.out.println();
        }
    }
}
