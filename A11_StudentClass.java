import java.util.ArrayList;

public class A11_StudentClass
{
    public static final double MAJOR_WEIGHT = .7;
    public static final double MINOR_WEIGHT = .2;
    public static final double OTHER_WEIGHT = .1;

    private static ArrayList<A11_Assignment> assignments;

    public A11_StudentClass()
    {
        assignments = new ArrayList<>();
    }

    public ArrayList<A11_Assignment> getAssignments()
    {
        return assignments;
    }
    public static void addAssignment(A11_Assignment a)
    {
        assignments.add(a);
    }
    public double average()
    {
        return majorAverage()*MAJOR_WEIGHT + minorAverage()*MINOR_WEIGHT + otherAverage()*OTHER_WEIGHT;
    }
    public double minorAverage()
    {
        int count = 0;
        double sum = 0;
        for (int i = 0; i < assignments.size(); i++) {
            if (assignments.get(i).getCategory() == 1) {
                sum += assignments.get(i).getGrade();
                count++;
            }
        }
        if (count == 0)
            return 100;
        else return sum/count;
    }
    public double majorAverage()
    {
        int count = 0;
        double sum = 0;
        for (int i = 0; i < assignments.size(); i++) {
            if (assignments.get(i).getCategory() == 2) {
                sum += assignments.get(i).getGrade();
                count++;
            }
        }
        if (count == 0)
            return 100;
        else return sum/count;
    }
    public double otherAverage()
    {
        int count = 0;
        double sum = 0;
        for (int i = 0; i < assignments.size(); i++) {
            if (assignments.get(i).getCategory() == 0) {
                sum += assignments.get(i).getGrade();
                count++;
            }
        }
        if (count == 0)
            return 100;
        else return sum/count;
    }

}
