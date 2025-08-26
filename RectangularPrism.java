public class RectangularPrism
{
    private int length;
    private int width;
    private int height;

    public RectangularPrism()
    {
        length = width = height = 1;
    }
    public RectangularPrism(int length, int width, int height)
    {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public int getLength()
    {
        return length;
    }
    public int getWidth()
    {
        return width;
    }
    public int getHeight()
    {
        return height;
    }
    public void setLength(int length)
    {
        this.length = length;
    }
    public void setWidth(int width)
    {
        this.width = width;
    }
    public void setHeight(int height)
    {
        this.height = height;
    }
    public int surfaceArea()
    {
        return 2*length*width + 2*length*height + 2*width*height;
    }
    public int volume()
    {
        return length*width*height;
    }
    public String toString()
    {
        return "Dimensions: (" + getLength() + "/" + getWidth() + "/" + getHeight() + ") / Surface Area: (" + surfaceArea()+ ") / Volume: (" + volume() + ")";
    }
    public static void main(String[] args)
    {
        RectangularPrism r1 = new RectangularPrism();
        System.out.println(r1);
    }
}
