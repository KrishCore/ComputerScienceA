import java.util.Scanner;
public class A10_TicTacToe
{
    public static boolean isWinner(char[][] board, char player)
    {

        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player ||
                    board[0][i] == player && board[1][i] == player && board[2][i] == player)
                return true;
        }
        return board[0][0] == player && board[1][1] == player && board[2][2] == player ||
                board[0][2] == player && board[1][1] == player && board[2][0] == player;
    }
    public static boolean isCat(char[][] board)
    {
        boolean isCat = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == ' ' || isWinner(board,'X') || isWinner(board,'O'))
                {
                    isCat = false;
                    break;
                }
            }
        }
        return isCat;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        char[][] board = {{' ',' ',' '},
                          {' ',' ',' '},
                          {' ',' ',' '}};

        char player = 'X';
        while (true) {

            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length - 1; j++) {
                    System.out.print(" " + board[i][j] + " |");
                }
                System.out.print(" " + board[i][board.length - 1] + " ");
                if (i != 2)
                    System.out.println("\n-----------");
            }
            System.out.println();

            int row;
            int col;
            while (true) {
                System.out.println("\n" + player + " enter the column for your move (0-2):");
                col = scan.nextInt();
                System.out.println(player + " enter the row for your move(0-2):\n");
                row = scan.nextInt();
                if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                    board[row][col] = player;
                    break;
                } else
                    System.out.println("Invalid move, enter a new move.");
            }
            if (isWinner(board,player))
            {
                for (int i = 0; i < board.length; i++) {
                    for (int j = 0; j < board[i].length - 1; j++) {
                        System.out.print(" " + board[i][j] + " |");
                    }
                    System.out.print(" " + board[i][board.length - 1] + " ");
                    if (i != 2)
                        System.out.println("\n-----------");
                }
                System.out.println("\n\n" + player + " WINS!");
                break;
            }
            if (isCat(board))
            {
                for (int i = 0; i < board.length; i++) {
                    for (int j = 0; j < board[i].length - 1; j++) {
                        System.out.print(" " + board[i][j] + " |");
                    }
                    System.out.print(" " + board[i][board.length - 1] + " ");
                    if (i != 2)
                        System.out.println("\n-----------");
                }
                System.out.println("\n\nCats game.");
                break;
            }
            if (player == 'X')
                player = 'O';
            else //if (player == 'O')
                player = 'X';
        }
    }
}
