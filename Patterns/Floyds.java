package Patterns;

import java.util.Scanner;

public class Floyds {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // for (int i=0;i<n;i++){
        //     for (int j=0;j<=i;j++){
        //         System.out.print((char)(a+64)+" ");
        //         a++;
        //     }
        //     System.out.println();
        // }
         for (int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (int j=1;j<=(2*i)-1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

         for (int i=2;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (int j=1;j<=(2*i)-1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
