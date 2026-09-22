package ControlStatement;
import java.util.*;

public class ConditionSt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Age");
        int age=sc.nextInt();
        if(age>=18) {
            System.out.println("Your Eligible to Vote");
        }
        else{
            System.out.println("Your Not Eligible to Vote");

        }
        sc.close();

    }
}
