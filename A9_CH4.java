public class A9_CH4
{
    public static boolean startAndEndMatch(String text)
    {
        return text.length() >= 3 && text.substring(0,3).equalsIgnoreCase(text.substring(text.length()-3));
    }
    public static void main(String[] args)
    {
        String text = "abCabc";
        System.out.println(startAndEndMatch(text));
    }
}
