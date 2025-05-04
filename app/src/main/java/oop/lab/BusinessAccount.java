package oop.lab;

public class BusinessAccount extends BankAccount implements OnlineService, LoanService {

    private String statusPinjaman = "belum melakukan pengajuan dana";

    public BusinessAccount(String nomor, String nama, double saldoAwal) {
        super(nomor, nama, saldoAwal);
    }

    @Override
    public double calculateInterest() {
        double bunga = balance * 0.05;
        balance += bunga;
        return bunga;
    }

    @Override
    public void applyForLoan(double jumlah) {
        statusPinjaman = "Pending";
    }

    @Override
    public String checkLoanStatus() {
        return statusPinjaman;
    }

    @Override
    public void payBills(double amount) {
        balance -= amount;
        }

    @Override
    public void transferFunds(double amount, String destinationAccount) {
        if (amount > balance) throw new IllegalArgumentException("Saldo Tidak Mencukupi");
        balance -= amount;
    }
}
