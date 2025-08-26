public class A9_CH6
{
    public static String middleValue(String text)
    {
        if (text.length() % 2 == 0)
            return text.substring(text.length()/2-2, text.length()/2 +2);
        else return text.substring(text.length()/2-1, text.length()/2 +2);
    }
    public static void main(String[] args)
    {
        String text = "123456789";
        System.out.println(middleValue(text));
    }
}
