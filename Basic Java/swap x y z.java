import java.io.*;
import java.util.*;

public class Solution {
    public static int swap(int x,int y,int z){
        int temp;
       int temp1=z;
        int temp2=y;
        y=x;
        z=temp2;
        x=temp1;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        swap(x,y,z);
    }
}