package Student;

import java.util.*;

public class StudentData {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
        
        System.out.println("enter a name");
        String str=sc.nextLine();
        System.out.println("enter ur roll no.");
        String roll=sc.nextLine();
        System.out.println("enter branch");
        String branch=sc.nextLine();
        System.out.println("college name");
        String college=sc.nextLine();
        System.out.println("enter age");
        int age=sc.nextInt();
        System.out.println("enter ph no.");
        long ph=sc.nextLong();
        System.out.println("enter cgpa");
        int cgpa=sc.nextInt();
        System.out.println(str+"\n"+roll+"\n"+branch+"\n"+college+"\n"+age+"\n"+ph+"\n"+cgpa);

        sc.close();
    }
}
