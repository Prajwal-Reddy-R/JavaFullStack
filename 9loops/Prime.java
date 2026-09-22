// package 9loops;
import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number ");
        int n=sc.nextInt();
        boolean flag=true;
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                flag=false;
                break;
            } 
        }
        if(flag)
            System.out.print(n+" is a prime number");
        else
            System.out.print(n+" is not a prime number");
        
    }
    
}
