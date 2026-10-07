import java.util.Scanner;

public class SumofN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum=0;
        int i=1;
        do{
            sum+=i;
            i++;
        }while(i<=n);
 
        System.out.println("Sum of first "+n+" natural numbers is "+sum);
    }
    
}
