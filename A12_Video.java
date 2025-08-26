public class A12_Video extends A12_Rental
{
    public final int G = 0;
    public final int PG = 1;
    public final int PG13 = 2;
    public final int R = 3;
    private String director;
    private int minutes;
    public A12_Video(String title, double cost, int rating, String director, int minutes)
    {
        super(title, cost, rating);
        this.director = director;
        this.minutes = minutes;
    }
    public String getDirector()
    {
        return director;
    }
    public int getMinutes()
    {
        return minutes;
    }
    public  String toString()
    {
        return super.toString() + String.format("Rating: %-20d\n" +
                "Director: %-20s\n" +
                "Runtime: %-20d", getRating(), director, minutes);
    }
}
