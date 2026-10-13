class TicketBooking implements Runnable{
    String cName;
    int age;
    TicketBooking(String cName, int age){
        this.cName = cName;
        this.age = age;
    }
    @Override
    public void run() {
        System.out.println("Starting ticket booking process....");
        System.out.println("Booking ticket for " + cName + " (Age: " + age + ")");
        try {
            Thread.sleep(5000); // Simulating ticket booking process
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Successfully booked ticket for " + cName + " (Age: " + age + ")");
    }
    
}

class MovieName implements Runnable{
    String movieName;
    int duration;
    double price;
    double rating;
    MovieName(String movieName, int duration, double price, double rating){
        this.movieName = movieName;
        this.duration = duration;
        this.price = price;
        this.rating = rating;   
    }
    @Override
    public void run() {
        System.out.println("Fetching movie details....");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Price: $" + price);
        System.out.println("Rating: " + rating);
    }
    
}
class Theater implements Runnable{
    String theaterName;
    String location;
    int totalSeats;
    Theater(String theaterName, String location, int totalSeats){
        this.theaterName = theaterName;
        this.location = location;
        this.totalSeats = totalSeats;   
    }
    @Override
    public void run() {
        System.out.println("Fetching theater details....");
        System.out.println("Theater Name: " + theaterName);
        System.out.println("Location: " + location);
        System.out.println("Total Seats: " + totalSeats);
    }
    
}

class Snacks implements Runnable{
    String snackName;
    double price;
    Snacks(String snackName, double price){
        this.snackName = snackName;
        this.price = price;   
    }
    @Override

    public void run() {
          System.out.println("Preparing snack.... " + snackName);
        try {
            Thread.sleep(2000); // Simulating snack preparation process
        } catch (InterruptedException e) {
            System.out.println("Snack preparation interrupted: " + e.getMessage());
        }
        
        System.out.println("Snack Name: " + snackName);
        System.out.println("Price: $" + price);
    }
     
    }
    


public class MovieTicketBooking {
    public static void main(String[] args) throws InterruptedException {
        TicketBooking ticketBooking = new TicketBooking("John Doe", 25);
        MovieName movieName = new MovieName("Inception", 148, 12.99, 8.8);
        Theater theater = new Theater("Cineplex", "Downtown", 200);
        Snacks snacks = new Snacks("Popcorn", 5.99);

        Thread ticketThread = new Thread(ticketBooking);
        Thread movieThread = new Thread(movieName);
        Thread theaterThread = new Thread(theater);
        Thread snacksThread = new Thread(snacks);

        ticketThread.start();
        ticketThread.join(); // Wait for ticket booking to complete before proceeding

        movieThread.start();
        movieThread.join(); // Wait for movie details to be printed before proceeding

        theaterThread.start();
        theaterThread.join();
        

        snacksThread.start();
        snacksThread.join();

        System.out.println("All tasks completed.");
    }
    
}
