package Basics;

import java.util.Scanner;

public class Generic_root{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();      
        int tempa = a;
        int sum = 0;

        while (tempa > 0) {
            int temp = tempa % 10;
            sum += temp;
            tempa = tempa / 10;
        }

        while (sum >= 10) {
            int temp1 = sum;
            sum = 0;
            while (temp1 > 0) {
                int temp2 = temp1 % 10; 
                sum += temp2;
                temp1 = temp1 / 10;
            }
        }

            System.out.println("Generic root is "+sum);
                 sc.close();

    }
}
