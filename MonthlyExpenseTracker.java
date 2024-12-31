//34. You are tasked with developing a program that tracks a user's monthly expenses. 
//The program should repeatedly ask the user to input their expenses for different categories (like food, transportation, etc.) until they type "done".
// After the user is finished, display the total expenses for the month 
import java.util.Scanner;

public class MonthlyExpenseTracker {
    public static void main(String[] args) {
        // Initialize variables
        double totalExpenses = 0.0; // Total expenses
        Scanner scanner = new Scanner(System.in); // Create a Scanner for input

        System.out.println("Monthly Expense Tracker");
        System.out.println("Enter your expenses for each category. Type 'done' to finish.");

        // Loop to collect expenses
        while (true) {
            System.out.print("Enter expense amount (or 'done'): ");
            String input = scanner.nextLine(); // Read user input

            // Check if the user wants to finish
            if (input.equalsIgnoreCase("done")) {
                break;
            }

            try {
                // Convert input to a double and add it to total expenses
                double expense = Double.parseDouble(input);
                if (expense < 0) {
                    System.out.println("Expense cannot be negative. Please enter a valid amount.");
                } else {
                    totalExpenses += expense;
                }
            } catch (NumberFormatException e) {
                // Handle invalid number inputs
                System.out.println("Invalid input. Please enter a valid number or 'done'.");
            }
        }

        // Display the total expenses
        System.out.printf("Your total expenses for the month: $%.2f\n", totalExpenses);
    }
}
