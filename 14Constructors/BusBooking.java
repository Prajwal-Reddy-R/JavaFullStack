import java.util.*;

class services{

    String name;
    String gender;
    String source;
    String destination;
    String date;
    String price;

    services(){
        System.out.println("Welcome to Bus Booking");
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter your name: ");
        name=sc.nextLine();
        System.out.println("Enter your gender: ");
        gender=sc.nextLine();
        System.out.println("Enter your source from these places 1:Bengaluru 2:Kolar 3:Srinivasapura");
        source=sc.nextLine();
        System.out.println("Enter your destination from : these places 1:Bengaluru 2:Kolar 3:Srinivasapura");
        destination=sc.nextLine();
        System.out.println("Enter your date of travel: ");
        date=sc.nextLine();
    }
    void fetchDetails(){
        System.out.println("Fetching your details");
        System.out.println("Details of the passenger are: ");
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Source: "+source);
        System.out.println("Destination: "+destination);
        System.out.println("Date of travel: "+date);
    }
    void fetchPrice(){
        System.out.println("Calculating price for your travel from "+source+" to "+destination);
        if(source.equals("Bengaluru") && destination.equals("Kolar")){
            price="Rs. 500";
        }
        else if(source.equals("Bengaluru") && destination.equals("Srinivasapura")){
            price="Rs. 1000";
        }
        else if(source.equals("Kolar") && destination.equals("Bengaluru")){
            price="Rs. 500";
        }
        else if(source.equals("Kolar") && destination.equals("Srinivasapura")){
            price="Rs. 700";
        }
        else if(source.equals("Srinivasapura") && destination.equals("Bengaluru")){
            price="Rs. 1000";
        }
        else if(source.equals("Srinivasapura") && destination.equals("Kolar")){
            price="Rs. 700";
        }
        else{
            price="Invalid source and destination";
        }
    }



}

public class BusBooking {
    public static void main(String args[]){
        services s = new services();
        s.fetchDetails();
        s.fetchPrice();
        System.out.println("Price: "+s.price);

    }
    
}
