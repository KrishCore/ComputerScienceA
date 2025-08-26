import java.util.ArrayList;

public class A12_ZombieDiceBucket
{
    private ArrayList<A12_ZombieDie> bucket;

    public A12_ZombieDiceBucket()
    {
        bucket = new ArrayList<>();
        loadBucket();
    }
    public void loadBucket()
    {
        bucket.clear();
        //add everything

        A12_GreenZombieDie GreenDie = new A12_GreenZombieDie();
        for (int i = 0; i < 6; i++) {
            bucket.add(GreenDie);
        }
        A12_YellowZombieDie YellowDie = new A12_YellowZombieDie();
        for (int i = 0; i < 4; i++) {
            bucket.add(YellowDie);
        }
        A12_RedZombieDie RedDie = new A12_RedZombieDie();
        for (int i = 0; i < 3; i++) {
            bucket.add(RedDie);
        }
    }
    public A12_ZombieDie draw()
    {
        int random = (int) (Math.random()* bucket.size());
        //Removes and returns 1 random die or null when the bucket is empty.
        if (bucket.isEmpty())
            return null;
        A12_ZombieDie drawn = bucket.get(random);
        bucket.remove(drawn);
        return drawn;
    }
}
