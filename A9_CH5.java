public class A9_CH5
{
    public static String substitutions(String text)
    {
        char[] textChars = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            if ("0123456789".contains(text.substring(i,i+1)))
                textChars[i] = '-';
        }
        for (int i = 0; i < text.length(); i++) {
            if ("aeiouAEIOU".contains(text.substring(i,i+1)))
                textChars[i] = '*';
        }
        text = "";
        for (char textChar : textChars) {
            text += textChar;
        }
        return text;
    }
    public static void main(String[] args)
    {
        String text = "I am on hole 19 of course.";
        System.out.println(substitutions(text));
    }
}
