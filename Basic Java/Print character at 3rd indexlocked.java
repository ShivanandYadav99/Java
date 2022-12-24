import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        
        int length=str.length();
        if(length>=4){
            System.out.println(str.charAt(3));
        }
        else
            System.out.println("Small string");
    }
}