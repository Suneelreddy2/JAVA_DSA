package Projects;
class BankAccount {
    int accountNumber;
    double balance;
    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void deposit(double amount) {
        balance += amount;
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }
    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}
class SavingsAccount extends BankAccount {
    double interestRate;
    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
    }
}
class CheckingAccount extends BankAccount {
    double overdraftLimit;
    CheckingAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }
    @Override
    void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            double overdraftUsed = 0;
            if (amount > balance) {
                overdraftUsed = amount - balance;
            }
            balance -= amount;
            System.out.println("Withdrawal: " + amount);
            if (overdraftUsed > 0) {
                System.out.println("Overdraft Used: " + overdraftUsed);
            }
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }
}
class FDAccount extends BankAccount {
    int termInYears;
    double fdInterestRate;
    FDAccount(int accountNumber, double balance, int termInYears, double fdInterestRate) {
        super(accountNumber, balance);
        this.termInYears = termInYears;
        this.fdInterestRate = fdInterestRate;
    }
    double calculateMaturityAmount() {
        double maturity = balance + (balance * fdInterestRate * termInYears / 100);
        return maturity;
    }
}
public class Bankmanager_Inheritance {
    public static void main(String[] args) {
        System.out.println("Savings Account");
        SavingsAccount sa = new SavingsAccount(101, 1000, 5);
        sa.displayBalance();
        sa.addInterest();
        System.out.println("After Interest: " + sa.balance);
        System.out.println("\nChecking Account");
        CheckingAccount ca = new CheckingAccount(102, 2000, 1000);
        ca.displayBalance();
        ca.withdraw(2500);
        System.out.println("\nFD Account");
        FDAccount fd = new FDAccount(103, 5000, 2, 6);
        fd.displayBalance();
        double maturity = fd.calculateMaturityAmount();
        System.out.println("Maturity Amount (after " + fd.termInYears + " years at " + (int)fd.fdInterestRate + "%): " + maturity);
    }
}
