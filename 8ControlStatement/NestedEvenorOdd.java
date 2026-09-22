package ControlStatement;

import java.util.*;

public class NestedEvenorOdd {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        if(num>0){
            if(num%2==0){
                System.out.println(num+" is Even");
            }
            else{
                System.out.println(num+" is Odd");
            }
        }
        else{
             if(num%2==0){
                System.out.println(num+" is Even");
            }
            else{
                System.out.println(num+" is Odd");
            }
            
        }
        sc.close();

     }

}
