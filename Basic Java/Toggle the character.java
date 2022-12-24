import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       
        Scanner sc=new Scanner (System.in);
        char ch=sc.next().charAt(0);
        
        if(ch>='a'&&ch<='z'){
            char ch1=(char)(ch-'a'+'A');
            System.out.println(ch1);
        }
        
        else if(ch>='A'&&ch<='Z'){
            char ch2=(char)(ch-'A'+'a');
            System.out.println(ch2);
        }
    }
}