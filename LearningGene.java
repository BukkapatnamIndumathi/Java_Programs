package Generics;

// Generic Box Class
class Box<T> {
    private T box;

    public Box(T box) {
        this.box = box;
    }

    // Getter
    public T getBox() {
        return box;
    }

    // Setter
    public void setBox(T box) {
        this.box = box;
    }
}

// Generic Product Class
class Prod<T, U> {
    private T name;
    private U price;

    public Prod(T name, U price) {
        this.name = name;
        this.price = price;
    }

    // Getter for name
    public T getName() {
        return name;
    }

    // Setter for name
    public void setName(T name) {
        this.name = name;
    }

    // Getter for price
    public U getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(U price) {
        this.price = price;
    }
}

public class LearningGene {
    public static void main(String[] args) {

        // Box Objects
        Box<Integer> b = new Box<>(22);
        Box<String> c = new Box<>("Indu");
        System.out.println(b);
        System.out.println(c);
    }
}