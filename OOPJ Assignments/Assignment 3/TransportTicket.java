import java.util.ArrayList;

class Ticket {
    int ticketId;
    String passengerName;
    String source;
    String destination;
    double fare;

    // Constructor
    Ticket(int ticketId, String passengerName, String source, String destination, double fare) {
        this.ticketId = ticketId;
        this.passengerName = passengerName;
        this.source = source;
        this.destination = destination;
        this.fare = fare;
    }

    // Update fare
    void updateFare(double newFare) {
        fare = newFare;
    }

    // Display ticket details
    void display() {
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Passenger: " + passengerName);
        System.out.println("Route: " + source + " -> " + destination);
        System.out.println("Fare: " + fare);
        System.out.println("--------------------------");
    }
}

public class Main {
    public static void main(String[] args) {

        // Store multiple tickets
        ArrayList<Ticket> tickets = new ArrayList<>();

        // Adding tickets
        tickets.add(new Ticket(1, "Sunil", "Pune", "Mumbai", 500));
        tickets.add(new Ticket(2, "Rahul", "Nashik", "Aurangabad", 400));
        tickets.add(new Ticket(3, "Amit", "Delhi", "Jaipur", 700));

        // Update fare of one ticket
        tickets.get(1).updateFare(450);

        // Calculate total fare
        double totalFare = 0;
        for (Ticket t : tickets) {
            totalFare += t.fare;
        }

        // Display all tickets
        System.out.println("=== Ticket Details ===");
        for (Ticket t : tickets) {
            t.display();
        }

        // Display total fare
        System.out.println("Total Fare of All Tickets: " + totalFare);
    }
}
