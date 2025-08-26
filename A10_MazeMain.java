import java.util.Scanner;
public class A10_MazeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        A10_Maze maze = new A10_Maze();
        boolean tf = true;
        do {
            if (tf)
                System.out.println("\n" + maze);
            System.out.println("Enter move (W - up, A - left, S - Down, D - Right):");
            char direction = scanner.nextLine().charAt(0);
            tf = true;
            if (!maze.move(direction)) {
                System.out.println("Invalid move");
                tf = false;
            }
        } while (!maze.won());

        System.out.println("\n" + maze);
        System.out.println("Congratulations you solved the maze in " + maze.getMoveCount() + " moves!");
    }
}
