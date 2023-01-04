import java.util.*;
class PrintiStringChar{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int lower=sc.nextInt();
       int heigher=sc.nextInt();
       for(int num=lower ;  num<=heigher  ;   num++){
        int count=0;
        for(int div=2;div*div<num;div++){
            if(num%div==0){
                count++;
                break;
            }

        }
        if(count==0){
            System.out.print(num+" ");
        }
       }
    }
}