public class BankAccount {
    private double Balance;
    String ownerName;

    public BankAccount() {}

    public BankAccount(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.Balance = balance;
    }

    public void Deposit(double amount) {
        if(amount < 0) {
            System.out.println("Invalid Amount");
            return;
        }
        this.Balance += amount;
    }

    public void Withdraw(double amount) {
        if(amount < 0) {
            System.out.println("Invalid Amount");
            return;
        }
        if(this.Balance < amount) {
            System.out.println("Insufficient Balance");
            return;
        }
        this.Balance -= amount;
    }
}