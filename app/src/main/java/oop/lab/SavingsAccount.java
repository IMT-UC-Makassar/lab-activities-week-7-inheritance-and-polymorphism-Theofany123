package oop.lab;

public class SavingsAccount extends BankAccount implements OnlineService {

    public SavingsAccount(String nomor, String nama, double saldoAwal) {
        super(nomor, nama, saldoAwal);
    }

    @Override
    public double calculateInterest() {
        double bunga = balance * 0.02;
        balance += bunga;
        return bunga;
    }

    @Override
    public void payBills(double amount) {
        balance -= amount;
        }

    @Override
    public void transferFunds(double amount, String destinationAccount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Saldo Tidak Mencukupi");
        }
        balance -= amount;
    }
}
