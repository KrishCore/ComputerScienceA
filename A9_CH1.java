public class A9_CH1
{
    public static boolean contains(String value, String searchedFor)
    {
        return value.equalsIgnoreCase(searchedFor) || value.toLowerCase().contains(searchedFor.toLowerCase());
    }
    public static void main(String[] args)
    {
        String value = "value";
        String searchedFor = "ue";
        System.out.println(value + " contains " + searchedFor + ": " + contains(value, searchedFor));
    }
}
