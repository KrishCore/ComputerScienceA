public class Alpha
{
    public static boolean isLetter(char character)
    {
        return (character >= 65 && character <= 90) || (character >= 97 && character <= 122);
    }
    public static void main(String[] args)
    {
        System.out.println(isLetter('a'));
    }
}
