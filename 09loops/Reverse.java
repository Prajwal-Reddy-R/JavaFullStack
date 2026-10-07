// package 9loops;
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number ");
        int n=Math.abs(sc.nextInt());
        int rev=0;
        while(n>0){
            int temp=n%10;
            rev=rev*10+temp;
            // System.out.print(temp); //reverse=reverse*10+temp
            n=n/10;

        }
        System.out.println("reversed number: "+rev);
        sc.close();
    }
    
}
