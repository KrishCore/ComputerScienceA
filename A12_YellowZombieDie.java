public class A12_YellowZombieDie extends A12_ZombieDie
{
    public A12_YellowZombieDie() {
        super(YELLOW);
    }
    @Override
    public void roll()
    {
        int num = (int) (Math.random()*7);
        if (num >= 0 && num <= 2) // 0 to 2
            setValue(RUNNER);
        else if (num > 2 && num <= 4) // 3 to 4
            setValue(BRAIN);
        else if (num > 4 && num <= 6) // 5 to 6
            setValue(SHOT);
        setDieColor(YELLOW);
    }

    @Override
    public String toString()
    {
        boolean run = getValue() == RUNNER;
        boolean shot = getValue() == SHOT;
        boolean brain = getValue() == BRAIN;
        {
            if (run)
                return "Yellow-Runner";
            if (shot)
                return "Yellow-Shot";
            if (brain)
                return "Yellow-Brain";
        }
        return "Yellow" ;
    }
}
