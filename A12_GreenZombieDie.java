public class A12_GreenZombieDie extends A12_ZombieDie
{
    public A12_GreenZombieDie() {
        super(GREEN);
    }
    @Override
    public void roll()
    {
        int num = (int) (Math.random()*7);
        if (num >= 0 && num <= 2) // 0 to 2
            setValue(RUNNER);
        else if (num > 2 && num <= 5) // 3 to 5
            setValue(BRAIN);
        else if (num == 6) // 6
            setValue(SHOT);
        setDieColor(GREEN);
    }

    @Override
    public String toString()
    {
        boolean run = getValue() == RUNNER;
        boolean shot = getValue() == SHOT;
        boolean brain = getValue() == BRAIN;
        {
            if (run)
                return "Green-Runner";
            if (shot)
                return "Green-Shot";
            if (brain)
                return "Green-Brain";
        }
        return "Green" ;
    }
}