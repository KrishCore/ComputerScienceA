public class MyLine
{
    private MyPoint p1;
    private MyPoint p2;
    public double slope;
    private double xInt;
    private double yInt;

    public MyLine(MyPoint p1, MyPoint p2)
    {
        this.p1 = p1;
        this.p2 = p2;
        fixData();
    }

    public MyPoint getPointOne()
    {
        return p1;
    }
    public MyPoint getPointTwo()
    {
        return p2;
    }
    public double getSlope()
    {
        slope = (p2.getY() - p1.getY()) / (p2.getX()- p1.getX());
        return slope;
    }
    public double getYInt()
    {
        //y=mx+b
        //b=y-mx
        yInt = p1.getY() - slope*p1.getX();

        fixData();

        return yInt;
    }
    public double getXInt()
    {
        //y=mx+b
        //0=mx+b
        //-b=mx
        //-b/m=x
        //x=-b/m
        xInt = -1 * (yInt/slope);
        return xInt;
    }
    public void setPointOne(MyPoint p1)
    {
        this.p1 = p1;
        fixData();
    }
    public void setPointTwo(MyPoint p2)
    {
        this.p2 = p2;
        fixData();
    }
    public void fixData()
    {
        slope = (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
        yInt = p1.getY() - slope*p1.getX();
        xInt = -1 * (yInt/slope);
    }
    public String toString()
    {
        return "Points: [(" + String.format("%.3f", p1.getX()) + "," + String.format("%.3f", p1.getY()) + "),("
                + String.format("%.3f", p2.getX()) + "," + String.format("%.3f", p2.getY()) + ")]" +
            "\nSlope: " + String.format("%.3f", slope) +
            "\nX Intercept: " + String.format("%.3f", xInt) +
            "\nY Intercept: " + String.format("%.3f", yInt) +
            "\nEquation: y = " + String.format("%.3f", slope) + "x + " + String.format("%.3f" ,yInt);
    }
}
