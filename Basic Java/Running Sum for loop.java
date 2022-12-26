import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
         Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            int val=sc.nextInt();
            sum+=val;
            System.out.println(sum);
        }
        
    }
}