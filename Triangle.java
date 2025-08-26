public class Triangle
{
    public static double hypotenuse(double side1, double side2)
    {
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }
    public static void main(String[] args)
    {
        System.out.println(hypotenuse(5, 5));
    }
}
