import java.util.ArrayList;

public class A11_CH4
{
    public static void removeInts (ArrayList<Integer> numbers, int[] toRemove)
    {
        for (int i = 0; i < toRemove.length; i++) {
            while (numbers.contains(toRemove[i]))
            {
                for (int j = 0; j < numbers.size(); j++) {

                    System.out.println(i + " * " + j);
                    if (numbers.get(j) == toRemove[i])
                        numbers.remove(j);
                    System.out.println(numbers);
                }
            }
        }

        System.out.println(numbers);
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(1);
        nums.add(5);
        nums.add(1);
        int[] rem = {1,3};

        removeInts(nums, rem);
    }
}
