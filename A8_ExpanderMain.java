import java.util.Scanner;
public class A8_ExpanderMain
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        A8_ArrayExpander arrayExpander = new A8_ArrayExpander();

        int selection;
        do {
            System.out.println("\n-Menu-\n" +
                    "1. Print\n" +
                    "2. Size\n" +
                    "3. Add\n" +
                    "4. Insert\n" +
                    "5. Set\n" +
                    "6. Remove\n" +
                    "7. Clear\n" +
                    "8. Exit\n" +
                    "Enter selection:\n");
            selection = scan.nextInt();
            if (selection < 1 || selection > 8)
                System.out.println("\nInvalid input");
            else if (selection == 1)
            {
                System.out.println(arrayExpander.toString());
            }
            else if (selection == 2)
            {
                System.out.println("The list has " + arrayExpander.size() + " elements.");
            }
            else if (selection == 3)
            {
                System.out.println("Enter a value to add:");
                int addValue = scan.nextInt();
                arrayExpander.add(addValue);
            }
            else if (selection == 4)
            {
                System.out.println("Enter a value to add:");
                int insertValue = scan.nextInt();
                System.out.println("Enter an index:");
                int index = scan.nextInt();
                arrayExpander.add(index, insertValue);
            }
            else if (selection == 5)
            {
                System.out.println("Enter the new value:");
                int setValue = scan.nextInt();
                System.out.println("Enter an index:");
                int setIndex = scan.nextInt();
                int replaced = arrayExpander.set(setIndex, setValue);
                System.out.println(replaced + " was replaced.");
            }
            else if (selection == 6)
            {
                System.out.println("Enter an index:");
                int removeIndex = scan.nextInt();
                int removed = arrayExpander.remove(removeIndex);
                System.out.println(removed + " was removed.");
            }
            else if (selection == 7)
            {
                arrayExpander.clear();
                System.out.println("The list has been cleared.");
            }
            else //if (selection == 8)
            {
                System.out.println("Goodbye.");
                break;
            }
        } while (true);
    }
}
