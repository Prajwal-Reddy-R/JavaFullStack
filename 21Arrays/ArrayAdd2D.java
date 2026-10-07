import java.util.Scanner;

public class ArrayAdd2D {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows=sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols=sc.nextInt();
        int arr1[][]=new int[rows][cols];
        int arr2[][]=new int[rows][cols];
        int sum[][]=new int[rows][cols];
        System.out.println("Enter the elements of first array: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of second array: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        //logic to add two 2D arrays
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        //printing the sum of two 2D arrays
        System.out.println("Sum of two 2D arrays is: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
