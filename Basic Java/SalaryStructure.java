import java.util.*;

public class SalaryStructure {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        int t=sc.nextInt();
        while((t--)!=0){
            int a=sc.nextInt();
            if(a<1500){
                int salary=a+(90*a/100)+(10*a/100);
                System.out.println(salary);
            }
            else{
                int salary=a+(98*a/100)+500;
                System.out.println(salary);
            }
        }
        
    }
}