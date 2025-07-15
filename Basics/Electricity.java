package Basics;

import java.util.Scanner;

public class Electricity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String customer_name=sc.nextLine();
        int customer_id=sc.nextInt();
        int no_of_units=sc.nextInt();
        double amount=0.0;
        if(no_of_units<=100){
             amount=no_of_units*1.50;
        }
        else if(no_of_units<=200){
            int remaining=no_of_units-100;
            amount=150+remaining*2.0;
        }
        else if(no_of_units<=300){
            int remaining=no_of_units-200;
            amount=550+remaining*3.0;
        }
        else{
            amount=550+(no_of_units-300)*5.0;
        }
        double gst=amount*0.05;
        if(amount>500){
            amount=amount-(amount* 0.05);
        }
        System.out.println(gst);
        double total_bill=amount+25.0+gst;
        System.out.println(total_bill);
        
    }
}
