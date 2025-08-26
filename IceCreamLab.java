import java.util.Scanner;
public class IceCreamLab
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of your ice cream shop:");
        String storeName = scan.nextLine();
        int selection;
        IceCreamShop iceCreamShop = new IceCreamShop(storeName);
        Dessert menuItem1  = null;
        Dessert menuItem2 = null;
        Dessert special = null;
        do {
            System.out.println("\n-Main Menu-\n" +
                    "1. View Shop's Menu\n" +
                    "2. Add / Change Menu Item 1\n" +
                    "3. Add / Change Menu Item 2\n" +
                    "4. Add / Change Special\n" +
                    "5. Sale\n" +
                    "6. Exit\n" +
                    "Enter selection:\n");
            selection = scan.nextInt();
            if (selection < 1 || selection > 6)
                System.out.println("\nInvalid input");
            else if (selection == 1)
            {
                System.out.println(iceCreamShop);
            }
            else if (selection == 2)
            {
                System.out.println("Enter menu item 1..");
                System.out.println("Enter the item's Name: ");
                String itemName1 = scan.nextLine();
                itemName1 = scan.nextLine();
                int container1;
                do {
                    System.out.println("Enter the item's container type (0-Cone/1-Bowl/2-Waffle Cone): ");
                    container1 = scan.nextInt();
                } while (container1 != 0 && container1 != 1 && container1 != 2);
                System.out.println("Enter the item's flavor: ");
                String flavor1 = scan.nextLine();
                flavor1 = scan.nextLine();
                System.out.println("Enter the item's toppings: ");
                String toppings1 = scan.nextLine();
                System.out.println("Enter the item's cost: ");
                double cost1 = scan.nextDouble();
                menuItem1 = new Dessert(itemName1, container1, flavor1, toppings1, cost1);
                iceCreamShop.setMenuItem1(menuItem1);
            }
            else if (selection == 3)
            {
                System.out.println("Enter menu item 2..");
                System.out.println("Enter the item's Name: ");
                String itemName2 = scan.nextLine();
                itemName2 = scan.nextLine();
                int container2;
                do {
                    System.out.println("Enter the item's container type (0-Cone/1-Bowl/2-Waffle Cone): ");
                    container2 = scan.nextInt();
                } while (container2 != 0 && container2 != 1 && container2 != 2);
                System.out.println("Enter the item's flavor: ");
                String flavor2 = scan.nextLine();
                flavor2 = scan.nextLine();
                System.out.println("Enter the item's toppings: ");
                String toppings2 = scan.nextLine();
                System.out.println("Enter the item's cost: ");
                double cost2 = scan.nextDouble();
                menuItem2 = new Dessert(itemName2, container2, flavor2, toppings2, cost2);
                iceCreamShop.setMenuItem2(menuItem2);
            }
            else if (selection == 4)
            {
                System.out.println("Enter menu item special..");
                System.out.println("Enter the item's Name: ");
                String specialS = scan.nextLine();
                specialS = scan.nextLine();
                int containerS;
                do {
                    System.out.println("Enter the item's container type (0-Cone/1-Bowl/2-Waffle Cone): ");
                    containerS = scan.nextInt();
                } while (containerS != 0 && containerS != 1 && containerS != 2);
                System.out.println("Enter the item's flavor: ");
                String flavorS = scan.nextLine();
                flavorS = scan.nextLine();
                System.out.println("Enter the item's toppings: ");
                String toppingsS = scan.nextLine();
                System.out.println("Enter the item's cost: ");
                double costS = scan.nextDouble();
                special = new Dessert(specialS, containerS, flavorS, toppingsS, costS);
                iceCreamShop.setSpecial(special);
            }
            else if (selection == 5)
            {
                if (iceCreamShop.getMenuItem1() != null)
                {
                    System.out.println(menuItem1);
                    System.out.println("Enter the new price for the above item: ");
                    double cost1 = scan.nextDouble();
                    menuItem1.setCost(cost1);
                }
                if (iceCreamShop.getMenuItem2() != null)
                {
                    System.out.println(menuItem2);
                    System.out.println("Enter the new price for the above item: ");
                    double cost2 = scan.nextDouble();
                    menuItem2.setCost(cost2);
                }
                if (iceCreamShop.getSpecial() != null)
                {
                    System.out.println(iceCreamShop.getSpecial());
                    System.out.println("Enter the new price for the above item: ");
                    double costS = scan.nextDouble();
                    special.setCost(costS);
                }
                if (iceCreamShop.getMenuItem1() == null && iceCreamShop.getMenuItem2() == null && iceCreamShop.getSpecial() == null)
                    System.out.println("You must first add items to the menu.");
            }
            else //if (selection == 6)
            {
                System.out.println("Goodbye.");
                break;
            }
        } while (true);
    }
}
