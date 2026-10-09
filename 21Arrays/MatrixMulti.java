import java.util.Scanner;

public class MatrixMulti {
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
        //logic to multiply two 2D arrays
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                sum[i][j]=0;
                for(int k=0;k<cols;k++){
                    sum[i][j]+=arr1[i][k]*arr2[k][j]; 
                }
            }
        }
        //printing the product of two 2D arrays
        System.out.println("Product of two arrays: ");
        for(int i=0;i<rows;i++){    
            
            for(int j=0;j<cols;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}

    

