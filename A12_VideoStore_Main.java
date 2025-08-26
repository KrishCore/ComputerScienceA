import java.util.ArrayList;
import java.util.Scanner;

public class A12_VideoStore_Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        A12_VideoStore store = new A12_VideoStore();
        int selection;
        ArrayList<A12_Video> rentedVideos = new ArrayList<>();
        ArrayList<A12_Game> rentedGames = new ArrayList<>();
        ArrayList<A12_Video> videos = store.getVideos();
        ArrayList<A12_Game> games = store.getGames();

        do {

            System.out.println("\nRenting Menu\n" +
                    "1. Rent Video\n" +
                    "2. Rent Game\n" +
                    "3. Checkout\n" +
                    "Enter selection:");
            selection = scan.nextInt();
            if (selection == 1) // videos
            {
                if (videos.isEmpty())
                {
                    System.out.println("\nThere are no more videos in stock.");
//                    break;
                }
                else
                {
                    System.out.println("\nVideo Menu");
                    int count = 1;

                    for (int i = 0; i < videos.size(); i++) {

                        if (!rentedVideos.contains(videos.get(i)))
                        {
                            System.out.println(count + ". " + videos.get(i).getTitle());
                            count++;
                        }
                        else count = i;
                    }

                    System.out.println("0. Cancel");
                    System.out.println("Enter selection:");
                    int vidSel = scan.nextInt();
                    if (vidSel != 0)
                    {
                        // need to print each individual component
                        vidSel -= 1;
//                        A12_Video selectedGame = store.videosInStock().get(vidSel);
                        System.out.printf("\nTitle: %33s\n", videos.get(vidSel).getTitle());
                        System.out.printf("Cost: %34.2f\n", videos.get(vidSel).getCost());
                        //create if statement for rating in game and videos
                        if (videos.get(vidSel).getRating() == 0)
                            System.out.printf("Rating: %32s\n", "General");
                        else if (videos.get(vidSel).getRating() == 1)
                            System.out.printf("Rating: %32s\n", "PG");
                        else if (videos.get(vidSel).getRating() == 2)
                            System.out.printf("Rating: %32s\n", "PG-13");
                        else if (videos.get(vidSel).getRating() == 3)
                            System.out.printf("Rating: %32s\n", "R");
                        System.out.printf("Director: %30s\n", videos.get(vidSel).getDirector());
                        System.out.printf("Runtime: %23s minutes\n", videos.get(vidSel).getMinutes());

                        System.out.println("\n1 - Rent, 2 - Put Back");
                        System.out.println("Enter selection:");
                        int rent = scan.nextInt();
                        if (rent == 1)
                        {
                            rentedVideos.add(videos.get(vidSel));
                            videos.remove(vidSel);
                        }
                    }
                }
            }
            else if (selection == 2) // games
            {
                if (games.isEmpty())
                {
                    System.out.println("\nThere are no more games in stock.");
//                    break;
                }
                else
                {
                    System.out.println("\nGame Menu");
                    int count = 1;

                    for (int i = 0; i < games.size(); i++) {
                        count = i+1;
                        if (!rentedGames.contains(games.get(i)))
                            System.out.println(i+1 + ". " + games.get(i).getTitle());
                        else count--;
                    }

                    System.out.println("0. Cancel");
                    System.out.println("Enter selection:");
                    int gameSel = scan.nextInt();
                    if (gameSel != 0)
                    {
                        // need to print each individual component
                        gameSel -= 1;
//                        A12_Video selectedGame = store.videosInStock().get(vidSel);
                        System.out.printf("\nTitle: %33s\n", games.get(gameSel).getTitle());
                        System.out.printf("Cost: %34.2f\n", games.get(gameSel).getCost());
                        //create if statement for rating in game and videos
                        if (games.get(gameSel).getRating() == 0)
                            System.out.printf("Rating: %32s\n", "Early Childhood");
                        else if (games.get(gameSel).getRating() == 1)
                            System.out.printf("Rating: %32s\n", "Everyone");
                        else if (games.get(gameSel).getRating() == 2)
                            System.out.printf("Rating: %32s\n", "Teen");
                        else if (games.get(gameSel).getRating() == 3)
                            System.out.printf("Rating: %32s\n", "Mature");
                        System.out.printf("Platform: %30s\n", games.get(gameSel).getPlatform());
                        System.out.printf("# of players: %26s\n", games.get(gameSel).getNumberOfPlayers());

                        System.out.println("\n1 - Rent, 2 - Put Back");
                        System.out.println("Enter selection:");
                        int rent = scan.nextInt();
                        if (rent == 1)
                        {
                            rentedGames.add(games.get(gameSel));
                            games.remove(gameSel);
                        }
                    }
                }
            }
            else //if (selection == 3) // exit
            {
                System.out.println();
                break;
            }
        } while (true);


        if (rentedVideos.isEmpty() && rentedGames.isEmpty())
            System.out.println("You did not rent anything.\nHave a good day!");
        else {
            double subtotal = 0;
            System.out.println("Receipt:\n"); // print everything else
            if (!rentedVideos.isEmpty())
            {
                System.out.println("Rented Videos:");

                for (int i = 0; i < rentedVideos.size(); i++) {
                    System.out.printf("    %-16s %19.2f\n", rentedVideos.get(i).getTitle(), rentedVideos.get(i).getCost());
                    subtotal += rentedVideos.get(i).getCost();
                }
                System.out.println();
            }

            if (!rentedGames.isEmpty())
            {
                System.out.println("Rented Games:");

                for (int i = 0; i < rentedGames.size(); i++) {
                    System.out.printf("    %-16s %19.2f\n", rentedGames.get(i).getTitle(), rentedGames.get(i).getCost());
                    subtotal += rentedGames.get(i).getCost();
                }
                System.out.println();
            }

            double tax = subtotal * 0.0825;
            System.out.printf("Subtotal: %30.2f\n", subtotal);
            System.out.printf("Tax: %35.2f\n", tax);
            System.out.printf("Total: %33.2f", subtotal + tax);
        }
    }
}
