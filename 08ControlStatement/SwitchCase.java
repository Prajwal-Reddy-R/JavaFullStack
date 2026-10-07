// package 8ControlStatement;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your score");
        int score=sc.nextInt();
        switch(score/10){
            case 10:
                case 9:
                    System.out.println("Excellent grade A");
                    break;
            case 8:
                System.out.println("Good grade B");
                break;
            case 7:
                System.out.println("Satisfactory grade C");
                break;
            case 6:
                System.out.println("Passing grade D");
                break;
            default:
                System.out.println("Failing grade F");

                
        }
        sc.close();
                  
  }
}
