package Operators;
import java.util.*;

public class Operator{
public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        //Relational Operators
        System.out.println("a+b :"+(a+b));
        System.out.println("a-b :"+(a-b));
        System.out.println("a*b :"+(a*b));
        System.out.println("a/b :"+(a/b));
        System.out.println("a%b :"+(a%b));
        System.out.println("a>b :"+(a>b));
        System.out.println("a<b :"+(a<b));
        System.out.println("a>=b :"+(a>=b));
        System.out.println("a<=b :"+(a<=b));
        System.out.println("a==b :"+(a==b));
        System.out.println("a!=b :"+(a!=b));

        //Logical Operators
        System.out.println("a>b && a<b :"+(a>b && a<b));
        System.out.println("a>b || a<b :"+(a>b || a<b));
        System.out.println("!(a>b && a<b) :"+!(a>b && a<b));

        sc.close();
}
}