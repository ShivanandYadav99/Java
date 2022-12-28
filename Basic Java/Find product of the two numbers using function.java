import java.io.*;
import java.util.*;

public class Solution {

    
    public static int product(int x,int y){
        return x*y;
    }
    public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(product(x,y));
    }
}