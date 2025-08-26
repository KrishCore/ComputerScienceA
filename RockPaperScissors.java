import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors
{
    public static String choiceText(int player)
    {
        if (player == 1)
            return "Rock";
        else if (player == 2)
            return "Paper";
        else if (player == 3)
            return "Scissors";
        else
            return"Invalid Input";
    }
    public static String gameResults(int player, int choice)
    {
        if (player == 1 && choice == 2)
            return "Paper covers rock. You lose.";
        if (player == 1 && choice == 3)
            return "Rock crushes scissors. You win!";
        if (player == 2 && choice == 1)
            return "Paper covers rock. You win!";
        if (player == 2 && choice == 3)
            return "Scissors cut paper. You lose.";
        if (player == 3 && choice == 1)
            return "Rock crushes scissors. You lose.";
        if (player == 3 && choice == 2)
            return "Scissors cut paper. You win!";
        if (player == choice)
            return "Tie Game.";
        else
            return "Invalid Inputs.";
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random randomGen = new Random();
        if(args!=null && args.length > 0)
            randomGen = new Random(Integer.parseInt(args[0]));
        int choice = randomGen.nextInt(3)+1;

        System.out.println("---Menu---");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        System.out.println("Enter selection: \n");
        int player = scan.nextInt();
        System.out.println("You picked: " + choiceText(player));
        System.out.println("The computer picked: " + choiceText(choice));
        System.out.println(gameResults(player, choice));

    }
}
