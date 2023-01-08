import java.util.Scanner;

public class PrefixSum {
    static void PreFixSum(int arr[]){
        for(int i=1;i<arr.length;i++){
              arr[i]+=arr[i-1];
        }
        // return arr;

    }
    public static void main(String[] args) {
        int n;
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of array ");
        n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the data of array ");
        for(int i=0;i<n;i++){
            
            arr[i]=sc.nextInt();
        }
        PreFixSum(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("Enter the Quires!=");
        int q=sc.nextInt();
        while(q-- > 0){
            System.out.println("Enter the two Number = ");
            int l=sc.nextInt();
            int r=sc.nextInt();
            int sum=arr[r-1]-arr[l-2];
            System.out.println("The sum is : "+sum);

             
        }

    }
}