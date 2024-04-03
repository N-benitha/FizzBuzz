import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Mortgage Calculator!");

        double loanAmount;
        double annualInterestRate;
        int loanTermYears;

        // Get loan amount
        do {
            System.out.println("Principal ($1K - $1M):");
            loanAmount = scanner.nextDouble();
            if (loanAmount < 1000 || loanAmount > 1000000) {
                System.out.println("Enter a number between $1,000 and $1,000,000 for the loan amount:");
            }
        } while (loanAmount < 1000 || loanAmount > 1000000);

        // Get annual interest rate
        do {
            System.out.println("Enter the annual interest rate (in percentage):");
            annualInterestRate = scanner.nextDouble();
            if (annualInterestRate <= 0 || annualInterestRate > 30) {
                System.out.println("Interest rate must be greater than 0 and less than or equal to 30.");
            }
        } while (annualInterestRate <= 0 || annualInterestRate > 30);

        // Get loan term in years
        do {
            System.out.println("Enter the loan term (in years):");
            loanTermYears = scanner.nextInt();
            if (loanTermYears < 1 || loanTermYears > 30) {
                System.out.println("Loan term must be between 1 and 30 years.");
            }
        } while (loanTermYears < 1 || loanTermYears > 30);

        // Calculate monthly interest rate
        double monthlyInterestRate = annualInterestRate / 12 / 100;

        // Calculate number of payments
        int numberOfPayments = loanTermYears * 12;

        // Calculate mortgage payment
        double mortgagePayment = (loanAmount * monthlyInterestRate) /
                (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));

        // Display the result
        System.out.printf("Your monthly mortgage payment is: $%.2f%n", mortgagePayment);

        scanner.close();
    }
}

