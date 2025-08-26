public class A12_Thief extends A12_GameCharacter
{
    private int stealthPoints;
    private int inventoryWeight;
    public A12_Thief(String characterName, int hitPoints,
                     int stealthPoints, int inventoryWeight)
    {
        super(characterName, hitPoints, 0);
        this.stealthPoints = stealthPoints;
        this.inventoryWeight = inventoryWeight;
    }
    public int getStealthPoints()
    {
        return stealthPoints;
    }
    public int getInventoryWeight()
    {
        return inventoryWeight;
    }
    public void setStealthPoints(int stealthPoints)
    {
        this.stealthPoints = stealthPoints;
    }
    public void setInventoryWeight(int inventoryWeight)
    {
        this.inventoryWeight = inventoryWeight;
    }
    public int stealthAbility()
    {
        if (stealthPoints - inventoryWeight/2 > 0)
            return stealthPoints - inventoryWeight/2;
        else return 0;
    }

    @Override
    public void takeDamage(int damage)
    {
        if (damage - stealthAbility() > 0)
            damage -= stealthAbility();
        else damage = 0;
        super.takeDamage(damage);
    }
}
