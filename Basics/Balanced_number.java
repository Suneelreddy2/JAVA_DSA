package Basics;

import java.util.Scanner;

public class Balanced_number {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int count=0;
    int left_sum=0;
    int right_sum=0;
    int temp=num;
    int rev=0;
    while(temp>0){
        count+=1;
        temp/=10;
    }
    int c=count/2;
    int c1=count/2;
    int temp1=num;
        while(temp1>0){
            if(c>0){
            c-=1;
            int rem=temp1%10;
            right_sum+=rem;
            }
            temp1/=10;
        }
        while(num>0){
            int rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
          while(rev>0){
            if(c1>0){
            c1-=1;
            int rem=rev%10;
            left_sum+=rem;
            }
            rev/=10;
        }
        System.out.println(right_sum==left_sum?"Balanced":"Not balanced");
        sc.close(); 
    
}   
}
