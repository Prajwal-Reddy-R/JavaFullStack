// package 9loops;
import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number ");
        int n=Math.abs(sc.nextInt());
        int original=n;
        int armstrong=0;
        while(n>0){
            int temp=n%10;
            armstrong=armstrong+(temp*temp*temp);
            // System.out.print(temp); //reverse=reverse*10+temp
            n=n/10;

        }
        if(armstrong==original){
            System.out.println(original +" is a armstrong number");
        }
        else{
            System.out.println(original +" is not a armstrong number");

        }
    }
}
