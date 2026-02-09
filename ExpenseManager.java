package localRepo;

import java.util.ArrayList;
import java.util.List;

public class ExpenseManager {
    private List<Expense> expenses;

    public ExpenseManager() {
        expenses = new ArrayList<>();
    }

    // Add Expense
    public void addExpense(String title, double amount, String category) {
        Expense expense = new Expense(title, amount, category);
        expenses.add(expense);
        System.out.println("✅ Expense Added Successfully!");
    }

    // Show All Expenses
    public void showExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("❌ No expenses found.");
            return;
        }
        System.out.println("\n--- All Expenses ---");
        for (Expense e : expenses) {
            System.out.println(e);
        }
    }

    // Calculate Total Expense
    public double getTotalExpense() {
        double total = 0;
        for (Expense e : expenses) {
            total += e.getAmount();
        }
        return total;
    }

    // Category-wise Expense
    public void categoryReport(String category) {
        double sum = 0;
        for (Expense e : expenses) {
            if (e.getCategory().equalsIgnoreCase(category)) {
                sum += e.getAmount();
            }
        }
        System.out.println("Total expense in " + category + " = " + sum);
    }
}
