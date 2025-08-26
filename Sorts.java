public class Sorts
{
    public static void selectionSort(int[] list)
    {
        for (int i = 0; i < list.length; i++) {
            int minIndex = i;
            for (int j = 0; j < i + 1; j++) {
                if (list[j] > list[minIndex])
                    minIndex = j;
                int temp = list[minIndex];
                list[minIndex] = list[i];
                list[i] = temp;
            }
        }
//        for a=0 to end
//        minIndex = a
//        for b = a+1 to end
//        if data[b] < data[minIndex]
//        minIndex = b
//        swap values at minIndex and a
    }
    public static void insertionSort(int[] list)
    {
        for (int i = 0; i < list.length; i++) {
            int temp = list[i];
            int j = i;
            while (j > 0 && list[j-1] > temp)
            {
                list[j] = list[j-1];
                j--;
                list[j] = temp;
            }
        }
    }
}
