import java.util.Scanner;
public class A9_PigLatin
{
    public static boolean isVowel(char character)
    {
        return "aeiou".contains("" + character);
    }
    public static String convertSingleWord(String word)
    {
        if (word.startsWith("qu"))
            return word.substring(2) + "quay";
        for (int i = 0; i < word.length(); i++) {
            char currentLetter = word.charAt(i);
//please try our mystic cheese squares the queen says they are really yummy
            if (isVowel(currentLetter) || (currentLetter == 'y' && i != 0)) {
                if (word.contains("qu") && currentLetter == 'u') {

                    return word.substring(i+1) + word.substring(0, i+1) + "ay";
                }
                if (i == 0) {
                    return word + "way";
                }
                return word.substring(i) + word.substring(0, i) + "ay";
            }

        }
        return word + "ay";
    }
    public static String convertSentence(String sentence)
    {
        String convertedSentence = "";
        for (String word : sentence.split(" "))
            convertedSentence += convertSingleWord(word) + " ";
        return convertedSentence;
    }
    public static void main (String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scan.nextLine();
        System.out.println("\nSentence in pig latin: " + convertSentence(sentence));
    }
}
