import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        
        if(Character.isLowerCase(ch)){
        if(ch>='a'&&ch<='w'){
            int x=ch;
            x+=3;
            ch=(char)x;
                System.out.println(ch);
        }
        else
            System.out.println("Can't jump");
    }
        else
            System.out.println("Not a small case");
   }
}