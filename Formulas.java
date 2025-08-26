public class Formulas
{
    public static double distance(double x1, double y1, double x2, double y2)
    {
        return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
    }

    public static void main(String[] args)
    {
        double distance = distance(5.5, 8.9, 9.2, 9.2);
//        (5.5, 8.9) (9.2,9.2)
        System.out.println(distance);
    }
}
