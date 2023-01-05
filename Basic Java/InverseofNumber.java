import java.util.*;
public class InverseOfNumber{
    static int fun(int n,int d){
        int count=0;
        while(n>0){
            int dp=n%10;
            count++;
            if(dp==d){
                break;

            }
           
            n=n/10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int x=n;
        while(n>0){
            int d=n%10;
            int pos=fun(x,d);    //to fing position .
            d--;
            while(d-->0){       
                pos*=10;



            }
            sum=sum+pos;   //to add with position .
            n=n/10;
            
        }

        System.out.println(sum);

        
    }
}