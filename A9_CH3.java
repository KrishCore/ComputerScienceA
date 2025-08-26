public class A9_CH3
{
    public static int totalLength(String[] textArray)
    {
//        String[] s = new String[textArray.length - 1];
        String s = "";
        for (int i = 0; i < textArray.length; i++) {
            s += textArray[i];
        }
        return s.length();
    }
    public static void main(String[] args)
    {
        String[] textArray = {"I", "like", "cheese"};
        System.out.println(totalLength(textArray));
    }
}
