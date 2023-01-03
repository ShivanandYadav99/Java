import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col*5 +" ");
            }
            System.out.println();
        }
    }
}