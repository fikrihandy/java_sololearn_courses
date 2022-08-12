import java.util.Scanner;

public class ConditionalsAndLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your Loan = ");
        int amount = scanner.nextInt();
        // Loan Calculator
        double payment;
        for (int i = 1; i <= 3; i++) {
            payment = 0.1 * amount;
            amount = (int) (amount - payment);
        }
        System.out.println("Remaining amount after 3 months = " + amount);
    }
}

//You take a loan from a friend and need to calculate how much you will owe him after 3 months.
//You are going to pay him back 10% of the remaining loan amount each month.
//Create a program that takes the loan amount as input, calculates and outputs the remaining amount after 3 months.