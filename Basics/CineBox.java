package OOPS.Basics;

import java.util.ArrayList;

class Ticket {

    String movie;
    double price;
    String category;

    static int confirmedTickets = 0;

    Ticket(String movie, double price, String category) {
        this.movie = movie;
        this.price = price;
        this.category = category;
    }

    void confirm() {
        System.out.println(movie + " - " + category + " seat confirmed");
        confirmedTickets++;
    }

    void display() {
        System.out.println(movie + " | " + category + " | Rs." + price);
    }
}

class PremiumTicket extends Ticket {

    PremiumTicket(String movie, double price, String category) {
        super(movie, price, category);
    }

    @Override
    void confirm() {
        System.out.println(movie + " - Premium/Recliner seat confirmed");
        confirmedTickets++;
    }
}

class Ticket3D extends Ticket {

    Ticket3D(String movie, double price, String category) {
        super(movie, price, category);
    }

    @Override
    void confirm() {
        System.out.println(movie + " - 3D seat confirmed + Glasses allotted");
        confirmedTickets++;
    }
}

class Booking {

    static int nextId = 1;

    int bookingId;
    String customer;
    String status;

    ArrayList<Ticket> tickets = new ArrayList<>();

    Booking(String customer) {
        this.customer = customer;
        bookingId = nextId++;
        status = "Booked";
    }

    void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    void processBooking() {

        status = "Confirming";

        for (Ticket ticket : tickets) {
            ticket.confirm();
        }

        status = "Confirmed";
    }

    void printBill(double discountPercent) {

        double subtotal = 0;

        System.out.println("\n----- CINEBOX BILL -----");
        System.out.println("Booking ID: " + bookingId);
        System.out.println("Customer: " + customer);

        for (Ticket ticket : tickets) {

            System.out.println(
                    ticket.movie + " | "
                            + ticket.category + " | Rs."
                            + ticket.price
            );

            subtotal = subtotal + ticket.price;
        }

        double discount = subtotal * discountPercent / 100;
        double afterDiscount = subtotal - discount;

        double gst = afterDiscount * 5 / 100;
        double total = afterDiscount + gst;

        System.out.println("------------------------");
        System.out.println("Subtotal: Rs." + subtotal);
        System.out.println("Discount: Rs." + discount);
        System.out.println("GST 5%: Rs." + gst);
        System.out.println("Final Total: Rs." + total);
        System.out.println("Status: " + status);
    }
}

class Cinema {

    ArrayList<Ticket> tickets = new ArrayList<>();

    void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    void displayTickets() {

        System.out.println("\n----- CINEBOX TICKETS -----");

        int i = 1;

        for (Ticket ticket : tickets) {

            System.out.print(i + ". ");
            ticket.display();

            i++;
        }
    }
}

public class CineBox {

    public static void main(String[] args) {

        // Create Cinema object
        Cinema cine = new Cinema();

        // Add 6 tickets
        cine.addTicket(new Ticket("Pushpa 2", 150, "Silver"));
        cine.addTicket(new Ticket("Pushpa 2", 200, "Gold"));
        cine.addTicket(new PremiumTicket("Kalki", 350, "Recliner"));
        cine.addTicket(new PremiumTicket("Kalki", 400, "Premium"));
        cine.addTicket(new Ticket3D("Avatar", 300, "3D"));
        cine.addTicket(new Ticket3D("Avatar", 350, "3D Premium"));

        // Display all tickets
        cine.displayTickets();

        // Create booking
        Booking booking = new Booking("Indumathi");

        // Add 4 tickets
        booking.addTicket(cine.tickets.get(0));
        booking.addTicket(cine.tickets.get(2));
        booking.addTicket(cine.tickets.get(4));
        booking.addTicket(cine.tickets.get(1));

        // Process booking
        booking.processBooking();

        // Print bill with 10% discount
        booking.printBill(10);

        // Total confirmed tickets
        System.out.println(
                "\nTotal Confirmed Tickets: "
                        + Ticket.confirmedTickets
        );
    }
}