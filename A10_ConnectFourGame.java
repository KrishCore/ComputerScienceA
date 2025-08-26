public class A10_ConnectFourGame
{
    public static final int PLAYING = 0;
    public static final int RED_WINS = 1;
    public static final int BLACK_WINS = 2;
    public static final int DRAW = 3;
    public static final int RED = 4;
    public static final int BLACK = 5;
    public static final int EMPTY = 6;

    private int[][] board;

    public A10_ConnectFourGame()
    {
        board = new int[6][7];
        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 7; col++) {
                board[row][col] = EMPTY;
            }
        }
    }
    public boolean dropPiece (int column, int player)
    {
        if (column >= 0 && column <= 6 && !columnFull(column))
        {
            for (int row = 5; row >= 0; row--) {
                if (board[row][column] == EMPTY)
                {
                    board[row][column] = player;
                    return true;
                }
            }
        }
        return false;
    }


    public int status()
    {
        // horizontal
        for (int row = 0; row < 6; row++) {
            for (int col = 0; col <= 3; col++) {
                if (board[row][col] == RED && board[row][col + 1] == RED &&
                        board[row][col + 2] == RED && board[row][col + 3] == RED) {
                    return RED_WINS;
                }
                if (board[row][col] == BLACK && board[row][col + 1] == BLACK &&
                        board[row][col + 2] == BLACK && board[row][col + 3] == BLACK) {
                    return BLACK_WINS;
                }
            }
        }
        // vertical
        for (int row = 0; row <= 2; row++) {
            for (int col = 0; col < 7; col++) {
                if (board[row][col] == RED && board[row + 1][col] == RED &&
                        board[row + 2][col] == RED && board[row + 3][col] == RED) {
                    return RED_WINS;
                }
                if (board[row][col] == BLACK && board[row + 1][col] == BLACK &&
                        board[row + 2][col] == BLACK && board[row + 3][col] == BLACK) {
                    return BLACK_WINS;
                }
            }
        }
        // diagonal (top-left to bottom-right)
        for (int row = 0; row <= 2; row++) {
            for (int col = 0; col <= 3; col++) {
                if (board[row][col] == RED && board[row + 1][col + 1] == RED &&
                        board[row + 2][col + 2] == RED && board[row + 3][col + 3] == RED) {
                    return RED_WINS;
                }
                if (board[row][col] == BLACK && board[row + 1][col + 1] == BLACK &&
                        board[row + 2][col + 2] == BLACK && board[row + 3][col + 3] == BLACK) {
                    return BLACK_WINS;
                }
            }
        }
        // also diagonal (bottom-left to top-right)
        for (int rol = 3; rol < 6; rol++) {
            for (int col = 0; col <= 3; col++) {
                if (board[rol][col] == RED && board[rol - 1][col + 1] == RED &&
                        board[rol - 2][col + 2] == RED && board[rol - 3][col + 3] == RED) {
                    return RED_WINS;
                }
                if (board[rol][col] == BLACK && board[rol - 1][col + 1] == BLACK &&
                        board[rol - 2][col + 2] == BLACK && board[rol - 3][col + 3] == BLACK) {
                    return BLACK_WINS;
                }
            }
        }
        // Check for a draw
        for (int col = 0; col < 7; col++) {
            if (!columnFull(col)) {
                return PLAYING;
            }
        }
        return DRAW;
    }


    public boolean columnFull(int column)
    {
        return board[0][column] != EMPTY;
    }
    public int[][] getBoard()
    {
        return board;
    }
    public void draw()
    {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == EMPTY)
                    System.out.print("|   ");
                else if (board[row][col] == RED)
                    System.out.print("| R ");
                else if (board[row][col] == BLACK)
                    System.out.print("| B ");
            }
            System.out.println("|");
        }
        System.out.println("-----------------------------");
    }
}
