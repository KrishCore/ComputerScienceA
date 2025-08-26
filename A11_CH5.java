import java.util.ArrayList;

public class A11_CH5
{
    public static void removeShared(ArrayList<Integer> list1, ArrayList<Integer> list2)
    {
        ArrayList<Integer> ph = new ArrayList<>();
        for (int i = 0; i < list2.size(); i++) {
            ph.add(list2.get(i));
        }
        System.out.println(ph);

        for (int i = 0; i < list1.size(); i++) {
            while (list2.contains(list1.get(i))) {
                for (int j = 0; j < list2.size(); j++) {

                    System.out.println(i + " * " + j);
                    if (list2.get(j) == list1.get(i))
                        list2.remove(j);
                    System.out.println(list1);
                    System.out.println(list2);
                }
            }
        }

        System.out.println("New stuff:\n\n");
        for (int i = 0; i < ph.size(); i++) {
            while (list1.contains(ph.get(i)))
            {
                for (int j = 0; j < list1.size(); j++) {

                    System.out.println(i + " * " + j);
                    if (list1.get(j) == ph.get(i))
                        list1.remove(j);
                    System.out.println(list1);
                    System.out.println(ph);
                }
            }
        }
        System.out.println("Result:");
        System.out.println(list1);
        System.out.println(list2);
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list2.add(1);
        list2.add(1);
        list2.add(1);
        list2.add(1);
        removeShared(list1, list2);
    }
}
