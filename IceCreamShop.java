public class IceCreamShop
{
    private String storeName;
    private Dessert menuItem1;
    private Dessert menuItem2;
    private Dessert special;

    public IceCreamShop(String storeName)
    {
        this.storeName = storeName;
        menuItem1 = null;
        menuItem2 = null;
        special = null;
    }
    public Dessert getMenuItem1()
    {
        return menuItem1;
    }
    public Dessert getMenuItem2()
    {
        return menuItem2;
    }
    public Dessert getSpecial()
    {
        return special;
    }
    public String getStoreName()
    {
        return storeName;
    }

    public void setMenuItem1(Dessert menuItem1) {
        this.menuItem1 = menuItem1;
    }
    public void setMenuItem2(Dessert menuItem2) {
        this.menuItem2 = menuItem2;
    }
    public void setSpecial(Dessert special) {
        this.special = special;
    }
    public String toString()
    {
        String s = "---" + storeName + "---";
        if (menuItem1 != null)
            s += "\n1. " + menuItem1;
        if (menuItem2 != null)
            s += "\n2. " + menuItem2;
        if (special != null)
            s += "\nS. " + special;
        if (menuItem1 == null && menuItem2 == null && special == null)
            s += "\nMenu Unavailable";
        return s;
    }
}
