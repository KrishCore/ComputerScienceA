import java.util.ArrayList;
import java.util.Scanner;

public class A12_ZombieDie_Main
{
    public static void shuffleNames(String[] names)
    {
        for (int i = 0; i < names.length; i += 1) {
            int rand1 = (int) (Math.random()*names.length);
            int rand2 = (int) (Math.random()*names.length);
            String temp = names[rand2];
            names[rand2] = names[rand1];
            names[rand1] = temp;
        }

    }
    public static String findWinner(String[] names, int[] scores)
    {
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 13)
            {
                return names[i];
            }
        }
        return null;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many players will be playing (2-5):");
        int numOfPlayer = scan.nextInt();
        String[] names = new String[numOfPlayer]; // Stores the player names
        for (int i = 0; i < numOfPlayer; i++) {
            System.out.println("Enter a player's name:");
            names[i] = scan.next();
        }
        shuffleNames(names);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        int[] scores = new int[numOfPlayer];  // Stores the scores of each player
        ArrayList<A12_ZombieDie> hand = new ArrayList<>();   // Stores the dice the play is about roll / the dice that were just rolled.
        ArrayList<A12_ZombieDie> brains = new ArrayList<>(); // Stores the brains rolled this round.
        ArrayList<A12_ZombieDie> shots = new ArrayList<>(); // Stores the shots rolled this round.
        ArrayList<A12_ZombieDie> runners = new ArrayList<>(); // Stores the runners just rolled.
        int sel = 1;
        boolean tf = true;
        boolean tf1 = true;
        int winnner = 0;
        int c = 0;
        do {

            // change 0 to # of brains in bank
            System.out.println(names[c] + " it is your turn and you have " + scores[c] + " brains in your bank.\n");
            do {
                System.out.println("        Turn summary:");
                System.out.println("                Brains:  " + brains);
                System.out.println("                Shots:   " + shots);
                System.out.println("                Runners: " + runners);
                System.out.println("        1. Keep Going");
                System.out.println("        2. Stop & add to bank");
                System.out.println("        Enter selection:");
                sel = scan.nextInt();
                if (sel == 1)
                {
                    A12_ZombieDiceBucket bucket = new A12_ZombieDiceBucket();
                    //                bucket.loadBucket();
                    hand.add(bucket.draw());
                    hand.add(bucket.draw());
                    hand.add(bucket.draw());

                    System.out.println("        After drawing you have the following dice: " + hand);
                    System.out.println("                Rolling...");
                    for (int i = 0; i < hand.size(); i++) {
                        if (hand.get(i).getValue() == 0)
                            hand.get(i).roll();
                    }
                    System.out.println("        The results of your rolls were: " + hand);
                    for (int i = 0; i < hand.size(); i++) {
                        if (hand.get(i).getValue() == 1)
                        {
                            runners.add(hand.get(i));
                        }
                        if (hand.get(i).getValue() == 2)
                        {
                            brains.add(hand.get(i));
                        }
                        if (hand.get(i).getValue() == 3)
                        {
                            shots.add(hand.get(i));
                        }
                    }

                    if (shots.size() >= 3)
                    {
                        System.out.println("        You got shot 3 times.");
                        System.out.println("        You lost all of your brains you earned this round");
                        sel = 2;
                        brains.clear();
                        shots.clear();
                        runners.clear();
                        hand.clear();
                        break;
                    }
                    hand.clear();
                }
                if (sel == 2)
                {
                    // change 2nd brains.size() to # of brains in bank
                    // try finding location of name in array and use that index for score
                    scores[c] += brains.size();
                    System.out.println("        You ate " + brains.size() + " brains this turn giving you " + scores[c] + " brains now in your bank.");
                    brains.clear();
                    shots.clear();
                    runners.clear();
                    hand.clear();
                    String s = "";
                    for (int i = 0; i < names.length; i++) {
                        s += names[i];
                    }
                    for (int i = 0; i < names.length; i++) {
                        if (findWinner(names, scores) != null && names[i] == findWinner(names, scores))
                            tf1 = false;
                    }
                    break;
                }
            } while (tf);
            // issue is here
            if (c == names.length-1)
                c = 0;
            else
                c++;
        } while (tf1);

        for (int i = 0; i < names.length; i++) {
            if (names[i] == findWinner(names, scores))
                winnner = i;
        }
        System.out.println(findWinner(names, scores) + " wins with " + scores[winnner]);
        //
    }
}

