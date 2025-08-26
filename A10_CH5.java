public class A10_CH5
{
    public static boolean equals(char[][] set1, char[][] set2)
    {
        boolean equals = false;
        if (set1.length == set2.length)
        {
            for (int i = 0; i < set1.length; i++)
            {
                if (set1[i].length == set2[i].length)
                {
                    for (int j = 0; j < set1[i].length; j++)
                    {
                        equals = set1[i][j] == set2[i][j];
                        if (!equals)
                            break;

                    }
                }
                if (!equals)
                    break;
            }
        }
        return equals;
    }
    public static void main(String[] args)
    {
        char[][] set1 = {
                {'C', 'A', 'T', 'S'},
                {'D', 'O', 'G', 'S'},
                {'F', 'I', 'S', 'H'},
                {'B', 'I', 'R', 'D'}};
        char[][] set2 = {
                {'C', 'A', 'T', 'S'},
                {'D', 'O', 'M', 'S'},
                {'F', 'I', 'S', 'H'},
                {'B', 'I', 'R', 'D'}};
        System.out.println(equals(set1, set2));
    }
}
