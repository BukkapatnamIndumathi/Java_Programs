package Abstraction;

// Abstract class
abstract class Payment {
    private String name;
    private int amount;

    public Payment(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public void display() {
        System.out.println("Name   : " + name);
        System.out.println("Amount : " + amount);
    }

    // Abstract method
    public abstract void pay();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

// Child class
class RockPayment extends Payment {

    public RockPayment(String name, int amount) {
        super(name, amount);
    }

    @Override
    public void pay() {
        System.out.println("Rock Payment Successful");
    }
}

// Main class
public class Abst {

    public static void main(String[] args) {

        Payment p = new RockPayment("Indu", 10000);

        p.display();
        p.pay();
    }
}
