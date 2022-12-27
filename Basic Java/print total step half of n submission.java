/*Take an integer input n and then keep on dividing n by 2, till the time n is greater than equal to 1.
Each time you divide n by 2, increment steps by 1.
Print the total number of steps in end.
 */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
Scanner Sc=new Scanner (System.in);
        int n= Sc.nextInt();
        
        int steps=0;
        while(n!=0){
            n=n/2;
            steps++;
        }
        System.out.println(steps);
    }
}