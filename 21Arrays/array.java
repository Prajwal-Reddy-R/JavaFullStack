// package 21Arrays;

public class array {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        arr[3]=9;
        //printing values of array
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        //sum of array values
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("Sum of array values: " + sum);
        //avg of array values
        double avg=(double)sum/arr.length;
        System.out.println("Average of array values: " + avg);

    }
    
}
