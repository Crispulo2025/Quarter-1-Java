import java.util.Scanner;

public class TicketBookingSystem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Initialize total seats available
        int totalSeats = 10;  // Example: 10 seats available

        System.out.println("Welcome to the Ticket Booking System!");
        System.out.println("Total available seats: " + totalSeats);

        // Continue booking until all seats are booked
        while (totalSeats > 0) {
            System.out.print("Enter number of tickets to book: ");
            int ticketsRequested = input.nextInt();

            if (ticketsRequested <= 0) {
                System.out.println("Invalid number of tickets. Try again.");
            } else if (ticketsRequested > totalSeats) {
                System.out.println("Not enough seats available. Seats left: " + totalSeats);
            } else {
                totalSeats -= ticketsRequested;
                System.out.println("Booking confirmed for " + ticketsRequested + " ticket(s).");
                System.out.println("Seats remaining: " + totalSeats);
            }

            // Ask if the user wants to continue booking
            if (totalSeats > 0) {
                System.out.print("Do you want to book more tickets? (yes/no): ");
                String choice = input.next();
                if (!choice.equalsIgnoreCase("yes")) {
                    break;
                }
            }
        }

        if (totalSeats == 0) {
            System.out.println("All tickets are booked.");
        }

        System.out.println("Thank you for using the Ticket Booking System!");
        input.close();
    }
}
