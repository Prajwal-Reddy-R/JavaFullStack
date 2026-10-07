import java.util.Scanner;

public class CntofEvenOdd{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        //logic to cnt even and odd elements
        int even=0;
        for(int num:arr){
            if(num%2==0) even++;
        }
        System.out.println("Even number count: "+even);
        System.out.println("Odd number count: "+(size-even));

    }

}