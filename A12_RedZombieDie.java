public class A12_RedZombieDie extends A12_ZombieDie
{
    public A12_RedZombieDie() {
        super(RED);
    }
    @Override
    public void roll()
    {
        int num = (int) (Math.random()*7);
        if (num >= 0 && num <= 2) // 0 to 2
            setValue(RUNNER);
        else if (num == 3) // 3
            setValue(BRAIN);
        else if (num > 3) // 4 to 13
            setValue(SHOT);
        setDieColor(RED);
    }

    @Override
    public String toString()
    {
        boolean run = getValue() == RUNNER;
        boolean shot = getValue() == SHOT;
        boolean brain = getValue() == BRAIN;
        {
            if (run)
                return "Red-Runner";
            if (shot)
                return "Red-Shot";
            if (brain)
                return "Red-Brain";
        }
        return "Red" ;
    }
}
