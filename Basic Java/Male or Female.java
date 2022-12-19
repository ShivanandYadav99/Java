//male or female
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
        char x=sc.next().charAt(0);
        if(x=='M'||x=='m')
            System.out.println("You are a male");
        else if(x=='F'||x=='f')
            System.out.println("You are a female");
       else
           System.out.println("Type again");
    }
}