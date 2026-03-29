// 18. Railway Reservation System
// Create a class RailwayReservation. Use synchronization to
// avoid double booking.
// Output: &#39;Ticket booked successfully&#39; or &#39;No tickets available&#39;

class RailwayReservation {
    private int tickets = 1;

    synchronized void bookTicket(String user) {
        if (tickets > 0) {
            System.out.println(user + ": Ticket booked successfully");
            tickets--;
        } else {
            System.out.println(user + ": No tickets available");
        }
    }

    public static void main(String[] args) {
        RailwayReservation reservation = new RailwayReservation();

        Thread t1 = new Thread(() -> reservation.bookTicket("User1"));
        Thread t2 = new Thread(() -> reservation.bookTicket("User2"));

        t1.start();
        t2.start();
    }
}
