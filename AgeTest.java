public class AgeTest
{
    public static String canIDrive(int age)
    {

        if (age < 16) {
            int x = 16-age;
            return "You can drive in "+ x +" year(s).";
        }
        else
            return "You are old enough to drive.";
    }
    public static void main(String[] args)
    {
        System.out.println(canIDrive(15));
    }
}
