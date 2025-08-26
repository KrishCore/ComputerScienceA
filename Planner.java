public class Planner
{
    public static boolean canParty(int numberStudents, int numberOfBirthdayStudents, int numberOfCakeSlices)
    {
        return numberOfCakeSlices >= (numberStudents - numberOfBirthdayStudents) + 2 * numberOfBirthdayStudents;
    }
    public static void main(String[] args)
    {
        System.out.println(canParty(165,122,300));
    }
}
