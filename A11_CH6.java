import java.util.ArrayList;


public class A11_CH6
{
    public static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2)
    {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            array.add(list1.get(i));
        }


        for (int i = 0; i < array.size(); i++) {
            for (int j = 0; j < array.size()-1; j++) {
                if (array.get(j+1) == array.get(j))
                    array.remove(j);
            }
        }

        list1 = array;


        for (int i = 0; i < list1.size(); i++) {
            int repl = list1.get(i);
            for (int j = list1.indexOf(repl)+1; j < list1.size(); j++) {
                if (list1.get(j) == repl)
                    list1.remove(j);
            }
        }
        System.out.println(list1 + " new L1");

        for (int i = 0; i < list2.size(); i++) {
            int repl = list2.get(i);
            for (int j = list2.indexOf(repl)+1; j < list2.size(); j++) {
                if (list2.get(j) == repl)
                    list2.remove(j);
            }
        }
        System.out.println(list2 + " new L2");

        ArrayList<Integer> combined = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            combined.add(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            if (!list1.contains(list2.get(i)))
                combined.add(list2.get(i));
        }

        System.out.println("combined " + combined);
        return combined;
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(1);
        list1.add(5);
        list1.add(1);


//        list2.add(5);
        list2.add(1);
        list2.add(3);
        System.out.println("list1 " + list1);
        System.out.println("list2 " + list2);
        System.out.println("merged " + merge(list1, list2));
    }
}
