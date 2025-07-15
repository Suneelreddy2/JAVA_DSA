package Patterns;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*"+" ");

        //     }
        //     System.out.println();
        // }
        //   for(int i=1;i<=n;i++){
        //     for(int j=i;j<=n;j++){
        //         System.out.print("*"+" ");

        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=n;i++){
        //     for(int j=i;j<n;j++){
        //         System.out.print(" ");

        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");

        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<i;j++){
        //         System.out.print(" ");

        //     }
        //     for(int j=i;j<=n;j++){
        //         System.out.print("*");

        //     }
        //     System.out.println();
        // }
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         if(j==1 || i==n || i==j){
        //         System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }

        //     }
            
        //     System.out.println();
        // }
        //   for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n-i+1;j++){
        //         if(j==1 || i==1 || j==(n-i+1)){
        //         System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }

        //     }
            
        //     System.out.println();
        // }
        //   for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++){
        //         if(j==n || i==n || j==(n-i+1)){
        //         System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }

        //     }
            
        //     System.out.println();
        // }
        
        //  for(int i=1;i<=n;i++){
        //     for(int j=0;j<n-i;j++){
        //         System.out.print(" ");

        //     }
        //     for(int j=1;j<=i;j++){
                // if(j==1 || i==n || j==i){
                // System.out.print(j);
                
                // }
                // else{
                //     System.out.print(" ");
                    
                // }

        //     }
            
        //     System.out.println();
        // }

         for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");

            }
            for(int j=1;j<=n-i+1;j++){
                if(j==1 || j==n-i+1 ||i==1)
                System.out.print(j);
                else{
                    System.out.print(" ");
                }
                             
                

            }
            System.out.println();
        }
       sc.close();
    
    }
}
