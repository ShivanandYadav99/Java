import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        
        for(int i=str.length()-1;i>-1;i--){
            System.out.print(str.charAt(i));
        }
    }
}