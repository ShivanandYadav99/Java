// if given character is digit then add 100 value 
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
    
        if(Character.isDigit(ch)){
            
            int val=Character.getNumericValue(ch);
            val=val+100;
            System.out.println(val);
        }else
            System.out.println("This is not a digit");
    }
}