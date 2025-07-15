package Basics;

import java.util.Scanner;

public class Flip_compare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int a_rev=0;
        int b_rev=0;
        while(a>0){
            int temp=a%10;
            a_rev=a_rev*10+temp;
            a=a/10;
        }
        while(b>0){
            int temp=b%10;
            b_rev=b_rev*10+temp;
            b=b/10;

        }
        System.out.println(a_rev>b_rev?a_rev:b_rev);
                 sc.close();

    }
}
