package rekord.zad10;

public record BankAccount(int numerKonta, double saldo) {
    public BankAccount(int numerKonta) {
        this(numerKonta,0);
    }
}
