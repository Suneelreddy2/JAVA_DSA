package Basics;

import java.util.Scanner;

public class Parking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int hours=sc.nextInt();
        if (hours<0){
         System.out.println("give valid hours");
         }
         if (hours<=2){
         System.out.println("Total charge is "+50);
         }
         else{
            int additional=hours-2;
            int total=50+additional*20;
            System.out.println("Total charge is "+total);
         }

                 sc.close();

    }
}
