import java.io.*;
import java.util.*;

public class Solution {
    public static int gcd(int x,int y){
        int i=1;
        int p=1;
        while(i<x||i<y){
            if(x%i==0&&y%i==0){
                p=i;
                i++;
            }
            i++;
        }
        return p;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(gcd(x,y));
    }
}