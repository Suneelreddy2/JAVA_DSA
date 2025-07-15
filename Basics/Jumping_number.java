package Basics;

import java.util.Scanner;

public class Jumping_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int prev=0;
        int flag=1;
        while(a>10){
           prev=a%10;
           a=a/10;
            int temp=a%10;
            if(Math.abs(prev-temp)==1){
                continue;
            }
            else{
                System.out.println("Not");
                flag=0;
                break;
            }
        }
        if (flag==1){
            System.out.println("yes");
        }
                 sc.close();

    }
}
