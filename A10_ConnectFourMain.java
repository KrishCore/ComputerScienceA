import java.util.Scanner;
public class A10_ConnectFourMain
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        A10_ConnectFourGame game = new A10_ConnectFourGame();
        int player = 4;
        int col;
        boolean print = true;

        do {
            System.out.println();
            if (print)
                game.draw();
            while (true) {
                if (player == 4)
                {
                    System.out.println("\nRed enter a column for your move (0-6):");
                    print = true;
                }
                else if (player == 5)
                {
                    System.out.println("\nBlack enter a column for your move (0-6):");
                    print = true;
                }
                col = scan.nextInt();

                if (col < 0 || col > 6)
                {
                    System.out.println("\nInvalid move.");
                    print = false;
                }
                else break;
            }

            if (!game.columnFull(col))
            {
                game.dropPiece(col, player);

                if (player == 4)
                    player = 5;
                else if (player == 5)
                    player = 4;
            }
            else
            {
                System.out.print("\nInvalid move.");
                print = false;
            }
        } while (game.status() == A10_ConnectFourGame.PLAYING);

        System.out.println();
        game.draw();
        if (game.status() == A10_ConnectFourGame.RED_WINS)
            System.out.println("\nRed Wins!");
        else if (game.status() == A10_ConnectFourGame.BLACK_WINS)
            System.out.println("\nBlack Wins!");
        else if (game.status() == A10_ConnectFourGame.DRAW)
            System.out.println("\nTie Game.");
    }
}
