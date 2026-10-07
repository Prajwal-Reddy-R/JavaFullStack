import java.util.*;

public class Fibonacci {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int n1=0,n2=1,n3;
        System.out.print("Fibonacci series up to "+n+" terms: ");
        for(int i=1;i<=n;i++){
            System.out.print(n1+" ");
            n3=n1+n2;
            n1=n2;
            n2=n3;
        }
    }
    
}

 