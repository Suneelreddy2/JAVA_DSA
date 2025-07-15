package Basics;

import java.util.Scanner;

public class Library {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int days=sc.nextInt();
    if(days<0){
        System.out.println("give valid days");
    }
    else{
        if(days<=5) System.out.println("Total fine is "+days*2+"rupees");
        else if(days<=10){
            int remaining=days-5;
            System.out.println("Total fine is "+(10+(remaining*5))+"rupees");
        }
        else{
            int remaining=days-10;
            System.out.println("Total fine is "+(25+remaining*5)+"rupees");
        }

    }
             sc.close();

 }   
}
