import java.util.Scanner;

/**
 * Write a description of class compound here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class compound
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

      
        char choice = 'y';

        while (choice == 'y' || choice == 'Y')
        {
            System.out.println("Enter deposit amount (min 1000): ");
            double P = sc.nextDouble();

            System.out.println("Enter annual interest rate (8 to 12): ");
            double annualRate = sc.nextDouble();

            System.out.println("Enter duration in years (max 5): ");
            int years = sc.nextInt();

            // Convert annual rate to monthly rate
            double monthlyRate = annualRate / 100.0 / 12.0;

            int months = years * 12;

            // Monthly compounding
            double A = P * Math.pow(1 + monthlyRate, months);

            // Processing fee = 0.5% of matured amount
            double fee = A * 0.005;

            double finalAmount = A - fee;

            System.out.println("------- FD RESULT -------");
            System.out.println("Principal: Rs. " + P);
            System.out.println("Annual Rate: " + annualRate + "%");
            System.out.println("Years: " + years);
            System.out.println("Maturity Amount (before fee): Rs. " + A);
            System.out.println("Processing Fee (0.5%): Rs. " + fee);
            System.out.println("Amount Customer Receives: Rs. " + finalAmount);

            System.out.println("\nDo you want to calculate again? (y/n): ");
            choice = sc.next().charAt(0);
        }

        System.out.println("Thank you!");
    }
}

