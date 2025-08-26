import java.util.ArrayList;

public class A11_Hangman
{
    public static final int MAX_GUESSES = 6;

    private int wrongGuesses;
    private ArrayList<String> sentences = new ArrayList<>();
    private final String sentence;
    private ArrayList<Character> vowels;
    private ArrayList<Character> consonants;

    public A11_Hangman()
    {
        {
            sentences.add("You are simply the best at this.");
            sentences.add("Skibidi Toilet Ohio Sigma Rizzler!");
            sentences.add("You are horrible at guessing games!");
            sentences.add("Do you think you are the best GOAT?");
            sentences.add("You should get off this computer.");
            sentences.add("You are playing my online Hangman!");
            sentences.add("Are you bad at playing this game?");
            sentences.add("Was this sentence too easy for you?");
            sentences.add("Skibidi Toilet is going to get you!");
            sentences.add("Go touch grass instead of playing.");
            sentence = sentences.get((int) (Math.random() * 10));
        }
        wrongGuesses = 1;
        vowels = new ArrayList<>();
        consonants = new ArrayList<>();
    }
    public A11_Hangman(String sentence)
    {
        this.sentence = sentence;
        wrongGuesses = 0;
        vowels = new ArrayList<>();
        consonants = new ArrayList<>();
    }

    public boolean won()
    {
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.toUpperCase().charAt(i);
            if (Character.isLetter(c) && !vowels.contains(c) && !consonants.contains(c))
                return false;
        }
        return true;
    }
    public void printSentence()
    {
        String s = "";
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (Character.isLetter(c))
                if (vowels.contains(Character.toUpperCase(c)) ||
                        consonants.contains(Character.toUpperCase(c)))
                    s += c;
                else s += "-";
            else s += c;
        }
        System.out.println(s);
    }
    public int guessesLeft()
    {
        return MAX_GUESSES - wrongGuesses;
    }
    public boolean addGuessedLetter(char c)
    {
        c = Character.toUpperCase(c);
        if (isPunctuation(c) || c == ' ') {
            wrongGuesses++;
            return false;
        }

        if (vowels.contains(c) || consonants.contains(c)) {
            wrongGuesses++;
            return false;
        }

        if (isVowel(c)) {
            vowels.add(c);
        }
        else {
            consonants.add(c);
        }

        if (!isInSentence(c)) {
            wrongGuesses++;
            return false;
        }

        return true;
    }
    public void printGuessed()
    {
        System.out.println("Guessed vowels: " + vowels);
        System.out.println("Guessed consonants: " + consonants);
        if (guessesLeft() == 1)
            System.out.println("You have 1 wrong guess left.");
        else System.out.println("You have " + (guessesLeft()) + " wrong guesses left.");
    }
    public boolean isPunctuation (char c)
    {
        return ".,:;\"'!?".contains(c + "");
    }
    public boolean isInSentence(char c)
    {
        return sentence.toLowerCase().contains((c+"").toLowerCase());
    }
    public boolean isVowel(char c)
    {
        return "AaEeIiOoUu".contains(c + "");
    }
}
