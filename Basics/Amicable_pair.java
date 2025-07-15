package Basics;
import java.util.Scanner;

public class Amicable_pair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int a_sum=0;
        int b_sum=0;
        for(int i=1;i<a;i++){
            if(a%i==0){
                a_sum+=i;
            }
        }
          for(int i=1;i<b;i++){
            if(b%i==0){
                b_sum+=i;
            }
        }
        if(a_sum==b && b_sum==a){
            System.out.println("Amicable");
        }
                 sc.close();

    }
}
