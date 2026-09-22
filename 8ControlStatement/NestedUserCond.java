package ControlStatement;

import java.util.Scanner;

public class NestedUserCond {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter username");
        String name=sc.nextLine();
        System.out.println("Enter role");
        String role=sc.nextLine();
        System.out.println("Enter password");
        String pass=sc.nextLine();
        if(role.equals("admin")){
            if(pass.equals("admin123")){
                System.out.println("Welcome "+name+" pemission granted");
            }
            else{
                System.out.println("permission denied");
            }
        }
        else if(role.equals("user")){
            if(pass.equals("user123")){
                System.out.println("Welcome "+name+" pemission granted");
            }
            else{
                System.out.println("permission denied");
            }
        }
        else{
            System.out.println("Invalid role");
        }
        sc.close();
    }
}
