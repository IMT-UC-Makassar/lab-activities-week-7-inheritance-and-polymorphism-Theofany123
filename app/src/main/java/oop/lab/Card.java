package oop.lab;

public class Card {
    private String number;
    private String owner;

    public Card(String number, String owner) {
        this.number = number;
        this.owner = owner;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void displayInfo() {
        System.out.println("Nomor Kartu: " + number);
        System.out.println("Pemilik: " + owner);
    }

    public double getInterestRate() {
        return 0.0;
    }
}

