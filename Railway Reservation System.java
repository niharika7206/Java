class RailwayReservation {

    private int availableTickets = 1; // only 1 ticket to show conflict

    // synchronized method to avoid double booking
    public synchronized void bookTicket(String user) {
        if (availableTickets > 0) {
            System.out.println(user + " is booking ticket...");
            try {
                Thread.sleep(1000); // simulate processing time
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }

            availableTickets--;
            System.out.println("Ticket booked successfully");
        } else {
            System.out.println("No tickets available");
        }
    }
}

// Runnable class for users
class User implements Runnable {

    RailwayReservation reservation;
    String name;

    public User(RailwayReservation reservation, String name) {
        this.reservation = reservation;
        this.name = name;
    }

    @Override
    public void run() {
        reservation.bookTicket(name);
    }
}

public class Main {
    public static void main(String[] args) {

        RailwayReservation reservation = new RailwayReservation();

        // Two users trying to book at same time
        Thread t1 = new Thread(new User(reservation, "User1"));
        Thread t2 = new Thread(new User(reservation, "User2"));

        t1.start();
        t2.start();
    }
}
