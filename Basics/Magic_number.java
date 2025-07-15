package Basics;

import java.util.Scanner;

public class Magic_number {
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

        System.out.println("Final digit: " + sum);
        if (sum == 1) {
            System.out.println("Magic number");
        } else {
            System.out.println("Not a magic number");
        }
                 sc.close();

    }
}
