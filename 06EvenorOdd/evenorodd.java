//Prajwal
import java.util.*;

public class evenorodd {
    public static void main(String[] args) {
        Scanner pj=new Scanner(System.in);
        System.out.println("Enter a number to check it is even or odd :");
        int num=pj.nextInt();
        System.out.print(num%2==0? num+" is even" :" is odd");
        pj.close();
    }
}
