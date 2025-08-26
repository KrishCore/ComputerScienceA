public class MathWorks
{
    private int number;

    public MathWorks()
    {
        number = 100;
    }
    public MathWorks(int number)
    {
        this.number = number;
    }
    public int getNumber()
    {
        return number;
    }
    public void add(int value)
    {
        number+=value;
    }
    public void subtract(int value)
    {
        number-=value;
    }
    public void multiply(int value)
    {
        number*=value;
    }
    public void divide(int value)
    {
        number/=value;
    }
    public String toString()
    {
        return "The number is currently " + getNumber() + ".";
    }
    public static void main(String[] args)
    {
        MathWorks m1 = new MathWorks();
        System.out.println(m1);
    }
}
