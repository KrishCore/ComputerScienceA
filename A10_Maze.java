public class A10_Maze {
    private char[][] maze;
    private int playerColumn;
    private int playerRow;
    private int moveCount;

    public A10_Maze() {
        maze = new char[][]{{'W', 'W', 'W', 'W', 'W', '-'},
                {'S', '-', '-', '-', 'W', '-'},
                {'W', 'W', 'W', '-', 'W', '-'},
                {'W', '-', 'W', '-', 'W', '-'},
                {'E', '-', 'W', '-', '-', '-'},
                {'W', '-', '-', '-', 'W', 'W'}};
        playerRow = 1;
        playerColumn = 0;
        moveCount = 0;
    }

    public A10_Maze(char[][] load) {
        maze = new char[load.length][load[0].length];
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                maze[i][j] = load[i][j];
            }
        }
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if (maze[i][j] == 'S') {
                    playerRow = i;
                    playerColumn = j;
                }
            }
        }
        maze[playerRow][playerColumn] = 'X';
        moveCount = 0;
    }

//    error in won method
    public boolean won() {
        return maze[playerRow][playerColumn] == 'E';
    }

    public int getMoveCount() {
        return moveCount;
    }

    public int getPlayerRow() {
        return playerRow;
    }

    public int getPlayerColumn() {
        return playerColumn;
    }

    public boolean move(char direction) {
        if (!"WASD".contains(direction + ""))
            return false;
        else {
            int newRow = playerRow;
            int newColumn = playerColumn;

            if (direction == 'W'){
                newRow--;
            }
            else if (direction == 'A') {
                newColumn--;
            }
            else if (direction == 'S') {
                newRow++;
            }
            else if (direction == 'D') {
                newColumn++;
            }
            if (!(newRow >= 0 && newRow < maze.length && newColumn >= 0 && newColumn < maze[0].length && maze[newRow][newColumn] != 'W'))
                return false;
            if (moveCount == 0)
                maze[playerRow][playerColumn] = 'S';
            else maze[playerRow][playerColumn] = '-';

            playerRow = newRow;
            playerColumn = newColumn;
            moveCount++;
            return true;
        }
    }

    public String toString ()
    {
        String s = "";
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if (i == playerRow && j == playerColumn)
                    s += 'X';
                else s += maze[i][j];
            }
            s += "\n";
        }
        return s;
    }
}
