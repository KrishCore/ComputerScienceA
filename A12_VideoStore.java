import java.util.ArrayList;

public class A12_VideoStore
{
    private String platform;
    private ArrayList<A12_Rental> rentals;

    public A12_VideoStore()
    {
        rentals = new ArrayList<>();
        rentals.add(new A12_Game("Assassin's Creed", 4.99, 3, "Playstation 3", 1));
        rentals.add(new A12_Game("Frogger Advanced", 2.99, 0, "Game Boy Advanced", 1));
        rentals.add(new A12_Game("Bomberman Land", 2.99, 2, "Super NES", 4));

        rentals.add(new A12_Video("Iron Man 3", 3.99, 2, "Shawn Black", 130));
        rentals.add(new A12_Video("The Wolverine", 2.79, 3, "James Mangold", 126));
        rentals.add(new A12_Video("The Avengers", 1.99, 2, "Joss Whedon", 143));
    }
    public ArrayList<A12_Game> getGames()
    {
        ArrayList<A12_Game> games = new ArrayList<>();
        for (int i = 0; i < rentals.size(); i++) {
            if (rentals.get(i) instanceof A12_Game)
                games.add((A12_Game) rentals.get(i));
        }
        return games;
    }
    public ArrayList<A12_Video> getVideos()
    {
        ArrayList<A12_Video> videos = new ArrayList<>();
        for (int i = 0; i < rentals.size(); i++) {
            if (rentals.get(i) instanceof A12_Video)
                videos.add((A12_Video) rentals.get(i));
        }
        return videos;
    }
    public ArrayList<A12_Rental> rented()
    {
        ArrayList<A12_Rental> rented = new ArrayList<>();
        for (int i = 0; i < rentals.size(); i++) {
            if (rentals.get(i).isRented())
                rented.add(rentals.get(i));
        }
        return rented;
    }
    public ArrayList<A12_Game> gamesInStock()
    {
        ArrayList<A12_Game> gamesInStock1 = getGames();
        ArrayList<A12_Game> remove = new ArrayList<>();

        for (int k = 0; k < getGames().size(); k++) {
            if (rented().contains(getGames().get(k)))
                remove.add(gamesInStock1.get(k));
        }

        for (int i = 0; i < remove.size(); i++) {
            if (gamesInStock1.get(gamesInStock1.indexOf(remove.get(i))).isRented())
                gamesInStock1.remove(remove.get(i));
        }

        return gamesInStock1;
    }
    public ArrayList<A12_Video> videosInStock()
    {
        ArrayList<A12_Video> videosInStock1 = getVideos();
        ArrayList<A12_Video> remove = new ArrayList<>();

        for (int k = 0; k < getVideos().size(); k++) {
            if (rented().contains(getVideos().get(k)))
                remove.add(videosInStock1.get(k));
        }

        for (int i = 0; i < remove.size(); i++) {
            if (videosInStock1.get(videosInStock1.indexOf(remove.get(i))).isRented())
                videosInStock1.remove(remove.get(i));
        }

        return videosInStock1;
    }
}
