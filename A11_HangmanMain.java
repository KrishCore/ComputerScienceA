import java.util.Scanner;

public class A11_HangmanMain
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        A11_Hangman game;

        System.out.println("-Menu-");
        System.out.println("1. Enter Sentence");
        System.out.println("2. Random Sentence");
        System.out.println("Enter selection:\n");
        int cel = scan.nextInt();
        String sentence;
        if (cel == 1){
            System.out.println("Enter a sentence:");
            sentence = scan.nextLine();
            sentence = scan.nextLine();
            game = new A11_Hangman(sentence);
        }
        else {
            game = new A11_Hangman();
        }
        System.out.println();

        do {
            game.printSentence();
            System.out.println();
            game.printGuessed();
            System.out.println("Enter your guess:\n");
            char guess = scan.next().charAt(0);
            if (!game.addGuessedLetter(guess))
                System.out.println("Incorrect guess.\n");

        } while (!game.won() && game.guessesLeft() > 0);

        game.printSentence();
        System.out.println();
        if (game.guessesLeft() > 0)
            System.out.println("You saved this man with " + (game.guessesLeft()) + " wrong guesses still left.");
        else System.out.println("You failed to save this man.");
    }
}
