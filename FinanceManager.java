import java.util.ArrayList;

public class FinanceManager {
    private ArrayList<Transaction> transactions = new ArrayList<>();

    private static class Transaction {
        private String description;
        private double amount;

        public Transaction(String description, double amount) {
            this.description = description;
            this.amount = amount;
        }

        public String getDescription() {
            return description;
        }

        public double getAmount() {
            return amount;
        }
    }

    public void addTransaction(String description, double amount) {
        Transaction transaction = new Transaction(description, amount);
        transactions.add(transaction);
        System.out.println("Added: " + description + " $" + amount);
    }

    public double calculateTotalIncome() {
        double totalIncome = 0;
        for (Transaction transaction : transactions) {
            if (transaction.getAmount() > 0) {
                totalIncome += transaction.getAmount();
            }
        }
        return totalIncome;
    }

    public double calculateTotalExpenses() {
        double totalExpenses = 0;
        for (Transaction transaction : transactions) {
            if (transaction.getAmount() < 0) {
                totalExpenses += Math.abs(transaction.getAmount());
            }
        }
        return totalExpenses;
    }
    public void printTransactions() {
        System.out.println("\nTransactions:");
        for (Transaction transaction : transactions) {
            System.out.println(transaction.getDescription() + " $" + transaction.getAmount());
        }
    }
    public double maxvaluesforthisprogram() {
        return Double.MAX_VALUE;
    }

    public static void main(String[] args) {
        FinanceManager manager = new FinanceManager();

        // Adding transactions
        manager.addTransaction("Salary", 2500.0);
        manager.addTransaction("Rent", -800.0);
        manager.addTransaction("Groceries", -200.0);
        manager.addTransaction("Bonus", 500.0);
        manager.printTransactions();

        // Calculating and displaying totals
        double totalIncome = manager.calculateTotalIncome();
        double totalExpenses = manager.calculateTotalExpenses();

        System.out.println("\nSummary:");
        System.out.println("Total Income: $" + totalIncome);
        System.out.println("Total Expenses: $" + totalExpenses);
        System.out.println("Net Balance: $" + (totalIncome - totalExpenses));
    }
}
