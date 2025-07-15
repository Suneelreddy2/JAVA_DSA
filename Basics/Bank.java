package Basics;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double intial_amount=0;
        
        boolean bool=true;
        while(bool){
             System.out.println("Enter 1:Deposit \t 2.Withdraw \t 3.Checkbalance 4.Exit");
             int choice=sc.nextInt();  
        switch (choice) {
            case 1:
                System.out.println("Enter the money");
                int money=sc.nextInt();
                intial_amount=intial_amount+money;
                break;
            case 2:
                System.out.println("Enter the money");
                int withdraw_money=sc.nextInt();
                if(intial_amount<withdraw_money) System.out.println("Insufficient money");
                else intial_amount=intial_amount-withdraw_money;
                break;
            case 3:
                System.out.println("Total money"+intial_amount);
                break;
             case 4:
                bool=false;
                break;
            default:
                break;
        }
    }
                 sc.close();

    }
    
}
