public class A12_Mage extends A12_GameCharacter
{
    private int spellShieldCost;
    private int spellShieldAbsorbAmount;
    public A12_Mage(String characterName, int hitPoints, int magicPoints,
                    int spellShieldCost, int spellShieldAbsorbAmount) {
        super(characterName, hitPoints, magicPoints);
        this.spellShieldCost = spellShieldCost;
        this.spellShieldAbsorbAmount = spellShieldAbsorbAmount;
    }

    public int getSpellShieldCost()
    {
        return spellShieldCost;
    }
    public int getSpellShieldAbsorbAmount()
    {
        return spellShieldAbsorbAmount;
    }
    public void setSpellShieldCost(int spellShieldCost)
    {
        this.spellShieldCost = spellShieldCost;
    }
    public void setSpellShieldAbsorbAmount(int spellShieldAbsorbAmount)
    {
        this.spellShieldAbsorbAmount = spellShieldAbsorbAmount;
    }
    public void drinkManaPotion(int gain)
    {
        setMagicPoints(getMagicPoints() + gain);
    }

    @Override
    public void takeDamage(int damage)
    {
        if (getMagicPoints() >= spellShieldCost) {
            if (damage - spellShieldAbsorbAmount < 0)
                damage = 0;
            else damage -= spellShieldAbsorbAmount;
            setMagicPoints(getMagicPoints()-spellShieldCost);
        }

        super.takeDamage(damage);
    }
}
