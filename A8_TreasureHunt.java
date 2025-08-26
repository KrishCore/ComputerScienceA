import java.util.Scanner;
public class A8_TreasureHunt
{
    public static int findTreasure(char[] map)
    {
        int i = -2;
        for (i = 0; i < map.length; i++) {
            if (map[i] == 'T')
                break;
        }
        return i ;//+ 1;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the treasure map ('N' - No treasure and 'T' - Treasure):");
        String map = scan.next();
        char[] mapCharArray = map.toCharArray();

        if (findTreasure(mapCharArray) == -1)
            System.out.println("There is no treasure on this treasure map.");
        else System.out.println("\nThe treasure can be found in location " +findTreasure(mapCharArray) + ".");
    }
}
