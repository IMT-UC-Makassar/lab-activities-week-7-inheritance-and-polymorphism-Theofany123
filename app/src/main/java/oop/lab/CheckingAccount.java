package oop.lab;

public class CheckingAccount extends BankAccount implements OnlineService {

    public CheckingAccount(String nomor, String nama, double saldoAwal) {
        super(nomor, nama, saldoAwal);
    }

    @Override
    public double calculateInterest() {
        return 0.0;
    }

    @Override
    public void transferFunds(double amount, String destinationAccount) {
        if (amount > balance) throw new IllegalArgumentException("Saldo Tidak Mencukupi");
        balance -= amount;
    }

    @Override
    public void payBills(double amount) {
        balance -= amount;
        }
}
