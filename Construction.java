public class Construction
{
    public static boolean canCross(int bridgeCapacity, int truckWeight, int driverWeight, int loadWeight)
    {
        return bridgeCapacity >= truckWeight+driverWeight+loadWeight;
    }
    public static void main(String[] args)
    {
        System.out.println(canCross(100, 55, 5, 20));
    }
}
