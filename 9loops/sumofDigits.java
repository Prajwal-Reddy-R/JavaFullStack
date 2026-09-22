// package 9loops;
import java.util.*;

public class sumofDigits {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number ");
        int n=Math.abs(sc.nextInt());
        int original=n;
        int sum=0;
        while(n>0){
            int temp=n%10;
            sum+=temp;
            n=n/10;
        }
        System.out.println("Sum of "+ original+" is "+sum);
    }

}
