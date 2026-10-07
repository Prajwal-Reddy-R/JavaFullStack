package ControlStatement;

import java.util.Scanner;

public class NestedCond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println(a+" greater");
            }
            else{
                System.out.println(c+" greater");

            }
        }
        else{
            if(b>a){

                System.out.println(b+" greater");
            }
        
           else{
                System.out.println(c+" greater");

        }
    }
    sc.close();
            
  }
}
