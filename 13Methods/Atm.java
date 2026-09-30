import java.util.*;

class services{
    Scanner sc=new Scanner(System.in); 
    double totalbalance=0;
    void deposit(){
        System.out.println("Enter the amount to deposit: ");
        double amt=sc.nextDouble();
        totalbalance+=amt;

    }
    void withdraw(){
        System.out.println("Enter the amount to withdraw");
        double amt=sc.nextDouble();
        if(amt>totalbalance){
            System.out.println("Insufficient Balance");
        }
        else{
            totalbalance-=amt;
        }
    }
    void fetchBalance(){
        System.out.println("Balance in your account: "+totalbalance);
    }
}

public class Atm {
    public static void main(String args[]){
        services s1=new services();
        Scanner sc=new Scanner(System.in); 
        System.out.println("Welcome to ATM");
        System.out.println("Enter 1: to fetch bank details");
        System.out.println("Enter 2: to deposit amount");
        System.out.println("Enter 3: to withdraw amount");
        System.out.println("Enter 4: to fetch Totalbalance amount");
        System.out.println("Enter 5: to exit");
        // System.out.println("Enter your option");
        
        int option=0;
        while(option!=5){
            System.out.println("Enter your option");
           option=sc.nextInt();

        // System.out.println("Welcome to ATM");
        // System.out.println("Enter 1: to fetch bank details");
        // System.out.println("Enter 2: to deposit amount");
        // System.out.println("Enter 3: to withdraw amount");
        // System.out.println("Enter 4: to fetch Totalbalance amount");
        // System.out.println("Enter 5: to exit");
        // System.out.println("Enter your option");
        
        switch(option){
            case 2:
                s1.deposit();
                break;
            case 3:
                s1.withdraw();
                break;
            case 4:
                s1.fetchBalance();
                break;
            case 5:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid option");

        }
        sc.close();

     }
    }
}
