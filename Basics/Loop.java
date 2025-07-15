package Basics;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        boolean bool=true;
        Scanner sc=new Scanner(System.in);
        while(bool){
            System.out.println("Enter first number");
            int a=sc.nextInt();
            System.out.println("Enter second number");
            int b=sc.nextInt();
            System.out.println("Sum is"+(a+b));
            System.out.println("Do you want to continue");
            String option=sc.next();
            if (option.equals("no")){
             bool=false;
            }

        }
                 sc.close();

    }
}
