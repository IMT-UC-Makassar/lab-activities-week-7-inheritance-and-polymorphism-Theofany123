package oop.lab;
public class PlatinumCard extends Card {

    public PlatinumCard(String number, String owner) {
        super(number, owner);
    }

    @Override
    public double getInterestRate() {
        return 10.0;
    }
}
