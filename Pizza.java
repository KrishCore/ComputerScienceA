public class Pizza
{
    private int numToppings;
    private String customer;
    private String maker;

    public Pizza()
    {
        numToppings = 0;
        customer = "";
        maker = "";
    }
    public Pizza(int numToppings, String customer, String maker)
    {
        this.numToppings = numToppings;
        this.customer = customer;
        this.maker = maker;
    }
    public int getNumberOfToppings()
    {
        return numToppings;
    }
    public String getCustomer()
    {
        return customer;
    }
    public String getMaker()
    {
        return maker;
    }
    public void setNumberOfToppings(int numToppings)
    {
        this.numToppings = numToppings;
    }
    public void setCustomer(String customer)
    {
        this.customer = customer;
    }
    public void setMaker(String maker)
    {
        this.maker = maker;
    }
    public double price()
    {
        return 10 + .5*numToppings;
    }
    public String toString()
    {
        return getCustomer() + " ordered a pizza from " + getMaker() + " with " + getNumberOfToppings() + " topping(s), which costs $" + String.format("%.2f", price()) + ".";
    }
    public static void main(String[] args)
    {
        Pizza p1 = new Pizza();
        System.out.println(p1);
    }
}
