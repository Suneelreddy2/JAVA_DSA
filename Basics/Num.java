package Basics;

import java.util.Scanner;

public class Num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        int even=0;
        int odd=0;
        while(n>0){
            int temp=n%10;
            rev=rev*10+temp;
            n=n/10;
        }
        while(rev>0){
            int temp=rev%10;
            if(temp%2==0){
                even=even*10+temp;
            }
            else{
                odd=odd*10+temp;
            }
            rev=rev/10;
        }
        
        System.out.println(even-odd);
                 sc.close();

    }
}
