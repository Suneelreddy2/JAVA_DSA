package Basics;

import java.util.Scanner;

public class Digit_diffrence_decoder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int temp=a;
        int result=0;
        int rev=0;
        while(temp>0){
            int temp1=temp%10;
            rev=rev*10+temp1;
            temp=temp/10;
        }
        result=rev%10;
        int prev=rev%10;
        rev=rev/10;
        while(rev>0){
            int temp1=rev%10;
            int n=Math.abs(temp1-prev);
            result=result*10+n;
            prev=temp1;
            rev=rev/10;
        }
         System.out.println(result);
         sc.close();
    }
}
