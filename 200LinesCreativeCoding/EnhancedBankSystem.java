import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class EnhancedBankSystem {

    static class Transaction { 
        private String type;
        private double amount;

        public Transaction(String type, double amount) {
            this.type = type;
            this.amount = amount;
        }

        public String toString() {
            return type + ": " + amount;
        }
    }

    static class Account {
        private String owner;
        private String password;
        private double balance;
        private String accountType;
        private boolean overdraftProtection;
        private List<Transaction> transactions;

        public Account(String owner, String password, String accountType) {
            this.owner = owner;
            this.password = password;
            this.balance = 0.0;
            this.accountType = accountType;
            this.overdraftProtection = false;
            this.transactions = new ArrayList<>();
        }

        public String getOwner() {
            return owner;
        }

        public double getBalance() {
            return balance;
        }

        public String getAccountType() {
            return accountType;
        }

        public boolean hasOverdraftProtection() {
            return overdraftProtection;
        }

        public boolean checkPassword(String password) {
            return this.password.equals(password);
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                transactions.add(new Transaction("Deposited", amount));
                applyInterest();
            }
        }

        public boolean withdraw(double amount) {
            if (amount <= balance || (overdraftProtection && amount <= balance + 500)) {
                balance -= amount;
                transactions.add(new Transaction("Withdrawn", amount));
                return true;
            }
            return false;
        }

        public void setPassword(String newPassword) {
            this.password = newPassword;
        }

        public void setAccountType(String type) {
            this.accountType = type;
        }

        public List<Transaction> getTransactions() {
            return transactions;
        }

        public void applyInterest() {
            if ("Savings".equals(accountType)) {
                balance += balance * 0.01;
                transactions.add(new Transaction("Interest Applied", balance * 0.01));
            }
        }

        public void enableOverdraftProtection() {
            this.overdraftProtection = true;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Account> accounts = new ArrayList<>();

        while (true) {
            System.out.println("Enhanced Bank System Menu:");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. View Transactions");
            System.out.println("6. Enable Overdraft Protection");
            System.out.println("7. Change Password");
            System.out.println("8. Switch Account Type");
            System.out.println("9. View Account Holders");
            System.out.println("10. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter your name: ");
                String name = scanner.nextLine();
                System.out.print("Set your password: ");
                String password = scanner.nextLine();
                System.out.println("Choose account type (1. Savings, 2. Checking): ");
                int accountTypeChoice = scanner.nextInt();
                scanner.nextLine();
                String accountType = (accountTypeChoice == 1) ? "Savings" : "Checking";
                accounts.add(new Account(name, password, accountType));
                System.out.println("Account created successfully!");
                
            } else if (choice == 2) {
                System.out.print("Enter your name: ");
                String name = scanner.nextLine();
                System.out.print("Enter your password: ");
                String password = scanner.nextLine();
                System.out.print("Enter amount to deposit: ");
                double amount = scanner.nextDouble();

                Account account = getAccountByNameAndPassword(accounts, name, password);
                if (account != null) {
                    account.deposit(amount);
                    System.out.println("Deposited successfully!");
                } else {
                    System.out.println("Account not found or password incorrect!");
                }
                
            } else if (choice == 3) {
                System.out.print("Enter your name: ");
                String name = scanner.nextLine();
                System.out.print("Enter your password: ");
                String password = scanner.nextLine();
                System.out.print("Enter amount to withdraw: ");
                double amount = scanner.nextDouble();

                Account account = getAccountByNameAndPassword(accounts, name, password);
                if (account != null) {
                    if (account.withdraw(amount)) {
                        System.out.println("Withdrawn successfully!");
                    } else {
                        System.out.println("Insufficient funds or protection limit reached!");
                    }
                } else {
                    System.out.println("Account not found or password incorrect!");
                }
                
            } else if (choice == 4) {
                System.out.print("Enter your name: ");
                String name = scanner.nextLine();
                System.out.print("Enter your password: ");
                String password = scanner.nextLine();

                Account account = getAccountByNameAndPassword(accounts, name, password);
                if (account != null) {
                    System.out.println("Your balance: $" + account.getBalance());
                } else {
                    System.out.println("Account not found or password incorrect!");
                }
                
            } else if (choice == 5) {
                System.out.print("Enter your name: ");
                String name = scanner.nextLine();
                System.out.print("Enter your password: ");
                String password = scanner.nextLine();

                Account account = getAccountByNameAndPassword(accounts, name, password);
                if (account != null) {
                    System.out.println("Your transactions: ");
                    for (Transaction t : account.getTransactions()) {
                        System.out.println(t);
                    }
                } else {
                    System.out.println("Account not found or password incorrect!");
                }
                
            } else if (choice == 6) {
                System.out.print("Enter your name: ");
                String name = scanner.nextLine();
                System.out.print("Enter your password: ");
                String password = scanner.nextLine();

                Account account = getAccountByNameAndPassword(accounts, name, password);
                if (account != null) {
                    account.enableOverdraftProtection();
                    System.out.println("Overdraft protection enabled!");
                } else {
                    System.out.println("Account not found or password incorrect!");
                }
                
            } else if (choice == 7) {
                System.out.print("Enter your name: ");
                String name = scanner.nextLine();
                System.out.print("Enter your current password: ");
                String currentPassword = scanner.nextLine();
                System.out.print("Enter your new password: ");
                String newPassword = scanner.nextLine();

                Account account = getAccountByNameAndPassword(accounts, name, currentPassword);
                if (account != null) {
                    account.setPassword(newPassword);
                    System.out.println("Password changed successfully!");
                } else {
                    System.out.println("Account not found or password incorrect!");
                }
                
            } else if (choice == 8) {
                System.out.print("Enter your name: ");
                String name = scanner.nextLine();
                System.out.print("Enter your password: ");
                String password = scanner.nextLine();
                System.out.println("Choose new account type (1. Savings, 2. Checking): ");
                int accountTypeChoice = scanner.nextInt();
                scanner.nextLine();
                String accountType = (accountTypeChoice == 1) ? "Savings" : "Checking";

                Account account = getAccountByNameAndPassword(accounts, name, password);
                if (account != null) {
                    account.setAccountType(accountType);
                    System.out.println("Account type changed to " + accountType + "!");
                } else {
                    System.out.println("Account not found or password incorrect!");
                }
                
            } else if (choice == 9) {
                System.out.println("Account Holders: ");
                for (Account a : accounts) {
                    System.out.println(a.getOwner() + " - " + a.getAccountType());
                }
                
            } else if (choice == 10) {
                System.out.println("Thank you for using the Enhanced Bank System!");
                break;
            }
        }
        scanner.close();
    }

    private static Account getAccountByNameAndPassword(List<Account> accounts, String name, String password) {
        for (Account account : accounts) {
            if (account.getOwner().equals(name) && account.checkPassword(password)) {
                return account;
            }
        }
        return null;
    }
}
