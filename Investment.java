import java.util.Scanner;
public class Investment
{
    public static double totalInAccount(double investmentAmount, double annualInterestRate, int years)
    {
        double monthlyInterestRate = annualInterestRate/1200;
        return investmentAmount * Math.pow((1 + monthlyInterestRate), (years*12));
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount of money you are investing:");
        double investmentAmount = scan.nextDouble();
        System.out.println("Enter the annual interest rate on your investment:");
        double annualInterestRate = scan.nextDouble();
        System.out.println("Enter the number of years that you are planning to invest for (whole number):");
        int years = scan.nextInt();
        double totalAfterInvestment = totalInAccount(investmentAmount, annualInterestRate, years);
        double profit = totalAfterInvestment - investmentAmount;
        System.out.printf("\nInvesting $%.2f over %d years at an annual interest rate of %.2f%% you would earn $%.2f, giving you a total of $%.2f", investmentAmount, years, annualInterestRate, profit, totalAfterInvestment);
    }
}
