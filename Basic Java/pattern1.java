import java.util.*;
public class pattern1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();

        for(int i=1;i<=row;row++){
            for(int j=1;j<=col;col++){
                if(i==1||j==1||i==row||j==col){
                    System.out.print("*");
                }else
                System.out.print(" ");
            }
            System.out.print(\n);
        }
    }
}