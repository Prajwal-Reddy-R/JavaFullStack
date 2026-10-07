// package 21Arrays;
import java.util.Scanner;
public class ArrayUserIP {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The elements of array are: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\n"); // \n is used to print each element in a new line
        }

    }
    
}
