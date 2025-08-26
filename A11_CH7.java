import java.util.ArrayList;

public class A11_CH7
{
    public static ArrayList<Integer> intersect(ArrayList<Integer> list1, ArrayList<Integer> list2)
    {
        ArrayList<Integer> l1 = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            l1.add(list1.get(i));
        }
        System.out.println(l1 + " L1");

        ArrayList<Integer> l2 = new ArrayList<>();
        for (int i = 0; i < list2.size(); i++) {
            l2.add(list2.get(i));
        }
        System.out.println(l2 + " L2");



        ArrayList<Integer> intersect = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            int repl = list1.get(i);
            for (int j = list2.indexOf(repl); j < list2.size(); j++) {
                if (list2.contains(list1.get(i)) && !intersect.contains(list1.get(i)))
                    intersect.add(list1.get(i));
            }
        }
        System.out.println(intersect + " intersect");

        return intersect;
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(1);
        list2.add(2);
        System.out.println("list1 " + list1);
        System.out.println("list2 " + list2 + "\n");
        System.out.println("intersect " + intersect(list1, list2));
    }
}
