package oop.lab;

public class CreditCard extends Card {

    public CreditCard(String number, String owner) {
        super(number, owner);
    }

    @Override
    public double getInterestRate() {
        return 15.0;
    }
}
