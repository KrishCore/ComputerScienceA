public class A12_Rental
{
    private String title;
    private double cost;
    private int rating;
    private boolean rented;

    public A12_Rental(String title, double cost, int rating)
    {
        this.title = title;
        this.cost = cost;
        this.rating = rating;
        rented = false;
    }

    public String getTitle()
    {
        return title;
    }
    public double getCost()
    {
        return cost;
    }
    public int getRating()
    {
        return rating;
    }
    public boolean isRented()
    {
        return rented;
    }
    public void setRented(boolean rented)
    {
        this.rented = rented;
    }
    public String toString()
    {
        return String.format("Title: %-20s\n" +
                "Cost: %-20.2f\n", title, cost);
    }
}
