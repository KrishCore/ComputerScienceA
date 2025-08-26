public class A12_Game extends A12_Rental
{
    public final int EARLY_CHILDHOOD = 0;
    public final int EVERYONE = 1;
    public final int TEEN = 2;
    public final int MATURE = 3;
    private String platform;
    private int numberOfPlayers;
    
    public A12_Game(String title, double cost, int rating, String platform, int numberOfPlayers)
    {
        super(title, cost, rating);
        this.platform = platform;
        this.numberOfPlayers = numberOfPlayers;
    }
    public String getPlatform()
    {
        return platform;
    }
    public int getNumberOfPlayers()
    {
        return numberOfPlayers;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Rating: %-20d\n" +
                "Platform: %-20s\n" +
                "# of players: %-20d", getRating(), platform, numberOfPlayers);

    }
}
