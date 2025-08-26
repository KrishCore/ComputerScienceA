public class Player
{
    private String userName;
    private int experience;
    private int level;
    private int strength;
    private int dexterity;

    public Player()
    {
        userName = "Bobbob";
        experience = 0;
        level = 1;
        strength = 10;
        dexterity = 10;
    }
    public Player(String userName, int experience, int level, int strength, int dexterity)
    {
        this.userName = userName;
        this.experience = experience;
        this.level = level;
        this.strength = strength;
        this.dexterity = dexterity;
    }
    public String getUserName()
    {
        return userName;
    }
    public int getExperience()
    {
        return experience;
    }
    public int getLevel()
    {
        return level;
    }
    public int getStrength()
    {
        return strength;
    }
    public int getDexterity()
    {
        return dexterity;
    }
    public int armorClass()
    {
        return Math.max(10 + (dexterity - 10)/2, 10);
    }
    public void setUserName(String userName)
    {
        this.userName = userName;
    }
    public void setExperience(int experience)
    {
        this.experience = experience;
    }
    public void setLevel(int level)
    {
        this.level = level;
    }
    public void setStrength(int strength)
    {
        this.strength = strength;
    }
    public void setDexterity(int dexterity)
    {
        this.dexterity = dexterity;
    }
    public String toString()
    {
        return "Character: "+getUserName()+"\nLevel: "+getLevel()+"\nExperience: "+getExperience()+"\nStrength: "+getStrength()+"\nDexterity: "+getDexterity()+"\nArmor Class: "+armorClass();
    }
    public static void main(String[] args)
    {
        Player p1 = new Player();
        System.out.println(p1);
    }
}
