package BitwiseOperators;
import java.util.*;

public class operator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("a&b(and) :"+(a&b));
        System.out.println("a|b(or) :"+(a|b));
        System.out.println("a^b(xor) :"+(a^b));
        System.out.println("~a(not) :"+(~a));// -(a+1)
        System.out.println("a>>2(right shift) :"+(a>>2));
        System.out.println("a<<2(left shift) :"+(a<<1));
        sc.close();


    }
}