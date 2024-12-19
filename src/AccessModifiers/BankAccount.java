package AccessModifiers;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private double balance;
    private String ownerName;
    private List<String> transactions;

    public BankAccount() {
        this.transactions = new ArrayList<>();
        this.transactions.add("Account opened with zero balance");
    }

    public BankAccount(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
        this.transactions = new ArrayList<>();
        if (balance > 0) {
            this.transactions.add("Account opened with $" + this.balance + " balance");
        } else {
            this.transactions.add("Account opened with zero balance");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void Deposit(double amount) {
        if (amount < 0) {
            System.out.println("Invalid Amount");
            return;
        }
        this.balance += amount;
        this.transactions.add("Deposited $" + amount);
    }

    public void Withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Invalid Amount");
            return;
        }
        if (this.balance < amount) {
            System.out.println("Insufficient Balance");
            return;
        }
        this.balance -= amount;
        this.transactions.add("Withdrew $" + amount);
    }

    public void printTransactionHistory() {
        for (String transaction : this.transactions) {
            System.out.println(transaction);
        }
    }
}
