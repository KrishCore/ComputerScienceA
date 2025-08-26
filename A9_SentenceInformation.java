import java.util.Scanner;
public class A9_SentenceInformation
{
    public static boolean isVowel(char character)
    {
        return "AEIOUaeiou".contains("" + character);
    }
    public static boolean isConsonant(char character)
    {
        return "BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz".contains("" + character);
    }
    public static boolean isPunctuation(char character)
    {
        return "'!,.?;:\"".contains("" + character);
    }
    public static int consonantCount(String text)
    {
        int count = 0;
        char[] textArray = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            if (isConsonant(textArray[i]))
                count++;
        }
        return count;
    }
    public static int vowelCount(String text)
    {
        int count = 0;
        char[] textArray = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            if (isVowel(textArray[i]))
                count++;
        }
        return count;
    }
    public static int punctuationCount(String text)
    {
        int count = 0;
        char[] textArray = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            if (isPunctuation(textArray[i]))
                count++;
        }
        return count;
    }
    public static int wordCount(String text)
    {
        return text.split(" ").length;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sentence: ");
        String text = scan.nextLine();
        System.out.println("\n" + wordCount(text) + " words");
        System.out.println(text.length() + " characters");
        System.out.println(vowelCount(text) + " vowels");
        System.out.println(consonantCount(text) + " consonants");
        System.out.println(punctuationCount(text) + " punctuation characters");
    }
}
