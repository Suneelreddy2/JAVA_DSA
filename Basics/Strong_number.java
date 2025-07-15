package Basics;

import java.util.Scanner;

public class Strong_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int range=1;
        while(range<50000){
            int n=range;
            int result=0;

        while(n>0){
            int temp=n%10;
            int sum=1;
            for(int i=1;i<=temp;i++){
                sum=sum*i;
            }
            result=result+sum;
            n=n/10;

        }
        if(result==range){
            System.out.println(range);
        }
        range+=1;
        
    }
             sc.close();

}
}
