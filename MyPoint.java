public class MyPoint
{
    private double x;
    private double y;

    public MyPoint(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }
    public String toString()
    {
        return "(" + String.format("%.3f", x) + "," + String.format("%.3f", y) + ")";
    }
}
