public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.deposit(20);
        b1.withdraw(10);
        System.out.println(b1.balance);
    }

}
class BankAccount{
    double balance;
    public void deposit(double amount){
        this.balance += amount;
    }
    public void withdraw(double amount){
        this.balance -= amount;
    }
}
