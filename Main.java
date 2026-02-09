package localRepo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ExpenseManager manager = new ExpenseManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== EXPENSE TRACKER =====");
            System.out.println("1. Add Expense");
            System.out.println("2. Show All Expenses");
            System.out.println("3. Show Total Expense");
            System.out.println("4. Category-wise Report");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter category (Food/Travel/Shopping/etc): ");
                    String category = sc.nextLine();

                    manager.addExpense(title, amount, category);
                    break;

                case 2:
                    manager.showExpenses();
                    break;

                case 3:
                    System.out.println("💰 Total Expense: " + manager.getTotalExpense());
                    break;

                case 4:
                    System.out.print("Enter category: ");
                    String cat = sc.nextLine();
                    manager.categoryReport(cat);
                    break;

                case 5:
                    System.out.println("👋 Exiting...");
                    return;

                default:
                    System.out.println("❌ Invalid choice!");
            }
        }
    }
}
