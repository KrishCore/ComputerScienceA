public class A9_CH2
{
    public static String everyThirdLetter(String text)
    {
        char[] textChars = text.toCharArray();
        String s = "";
        for (int i = 0; i < textChars.length; i+=3) {
            s += textChars[i];
        }
        return s;
    }
    public static void main(String[] args)
    {
        String text = "why is this sentence so very long?";
        System.out.println(everyThirdLetter(text));
    }
}
