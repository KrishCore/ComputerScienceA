

public class Rectangle
{
    public static int area(int length, int width)
    {
        return length*width;
    }

    public static int perimeter(int length, int width)
    {
        return 2*length+2*width;
    }

    public static void main(String[] args)
    {
        int area = area(3, 5);
        int perimeter = perimeter(3, 5);
    }
}
