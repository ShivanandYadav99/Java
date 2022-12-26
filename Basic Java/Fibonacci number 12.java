import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        import java.io.*;
        import java.util.*;
        
        public class Solution {
        
            public static void main(String[] args) {
             
                /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
                 
                Scanner sc=new Scanner (System.in);
                int n= sc.nextInt();
                                             
                int i=0;
                int j=1;
                
                for(int p=1;p<=n;p++){
                    
                    System.out.print(i +" ");
                    int k=i+j;
                    i=j;
                    j=k;
                }
                
            }
            
        }
       
         
        Scanner sc=new Scanner (System.in);
        int n= sc.nextInt();
                                     
        int i=0;
        int j=1;
        
        for(int p=1;p<=n;p++){
            
            System.out.print(i +" ");
            int k=i+j;
            i=j;
            j=k;
        }
        
    }
    
}