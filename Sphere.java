public class Sphere
{
    public static double surfaceArea(double r)
    {
        return 4 * Math.PI * Math.pow(r, 2);
    }
    public static double volume(double r)
    {
        return (4.0/3) * Math.PI * Math.pow(r, 3);
    }
    public static void main(String[] args)
    {
        double a = surfaceArea(3.5);
        double b = volume(3.5);
        System.out.println(a);
        System.out.println(b);
    }
}
