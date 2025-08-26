public class School
{
    public static double finalGrade(double term1, double term2, double term3, double semesterGrade)
    {
        double average = (term1 + term2 + term3)/3;
        return (semesterGrade - average * .85)/.15;
    }

    public static void main(String[] args)
    {
        double v = finalGrade(85,85,93,92);
        System.out.println(v);
    }
}
