package AccessModifiers;

public class Client {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount();
        BankAccount bankAccount2 = new BankAccount("Joshy", 500);

        bankAccount1.Deposit(100);
        bankAccount1.Deposit(400);
        bankAccount1.Withdraw(50);
        bankAccount1.Deposit(80);
        bankAccount1.Deposit(200);
        bankAccount1.printTransactionHistory();
        System.out.println("");
        bankAccount2.Deposit(50);
        bankAccount2.Deposit(80);
        bankAccount2.Deposit(200);
        bankAccount2.Withdraw(50);
        bankAccount2.printTransactionHistory();
    }
}
