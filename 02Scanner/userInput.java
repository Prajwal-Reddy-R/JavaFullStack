import java.util.*;
public class userInput{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number");
        int num=sc.nextInt();
        System.out.print("enter a name");
        String str=sc.nextLine();
        System.out.print(num);
        System.out.print(str);
        sc.close();

    }
}