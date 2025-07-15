package Basics;

import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int position=sc.nextInt();
        int count=0;
        int range=2;

        while(range<10000){
            int num=range;
            int sum=0;
           for(int i=1;i<num;i++){
               if(num%i==0){
                    sum+=i;
                    }

             }
            if (sum==num){
                count+=1;
                if(count==position){

                 System.out.println(num);
                }
            }
        range+=1;
    }
             sc.close();

    }
}
