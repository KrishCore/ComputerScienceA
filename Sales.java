public class Sales
{
    public static double totalCost(double cost)
    {
        return cost * 1.0825;
    }
    public static void main(String[] args) {
        double tc = totalCost(19.99);
        System.out.println(tc);
    }
}
