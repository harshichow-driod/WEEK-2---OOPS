import java.util.Scanner;

class MovieTicket {
    String movieName;
    String seatNumber;
    double price;

    void bookTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully.");
    }

    void displayTicket() {
        System.out.println("\n----- Ticket Details -----");
        System.out.println("Movie Name : " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price      : " + price);
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieTicket ticket = new MovieTicket();

        System.out.print("Enter Movie Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Seat Number: ");
        String seat = sc.nextLine();

        System.out.print("Enter Ticket Price: ");
        double price = sc.nextDouble();

        ticket.bookTicket(name, seat, price);
        ticket.displayTicket();

        sc.close();
    }
}
