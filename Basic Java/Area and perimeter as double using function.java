import java.io.*;
import java.util.*;

public class Solution {
    
    public static double area(double r){
        return(3.14*r*r);
    }
    
    public static double perimeter(double r){
        return(2*3.14*r);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        double radious=sc.nextDouble();
        System.out.println(area(radious));
        System.out.println(perimeter(radious));
    }
}