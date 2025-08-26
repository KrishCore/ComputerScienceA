public class Dessert {
    public static final int CONE = 0;
    public static final int BOWL = 1;
    public static final int WAFFLE_CONE = 2;
    private String itemName;
    private int container;
    private String flavor;
    private String toppings;
    private double cost;

    public Dessert(String itemName, int container, String flavor,
                   String toppings, double cost) {
        this.itemName = itemName;
        this.container = container;
        this.flavor = flavor;
        this.toppings = toppings;
        this.cost = cost;
    }

    public String getItemName() {
        return itemName;
    }
    public String getContainer() {
        if (container == CONE)
            return "cone";
        else if (container == BOWL)
            return "bowl";
        else if (container == WAFFLE_CONE)
            return "waffle cone";
        else return "";
    }
    public String getFlavor() {
        return flavor;
    }
    public String getToppings() {
        return toppings;
    }
    public double getCost()
    {
        return cost;
    }
    public void setCost(double cost)
    {
        this.cost = cost;
    }
    public String toString()
    {
        String s = "(" + String.format("%5.2f", cost) + "): " + itemName + " - " + flavor
                + " ice cream in a(n) ";
        if(container == 0)
            s += "cone";
        else if(container == 1)
            s+= "bowl";
        else if(container == 2)
            s+= "waffle cone";
        s += " with " + toppings +".";
        return s;
        // (10.99): itemName - flavor ice cream in a(n) container with toppings.
    }
}
