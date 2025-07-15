package Basics;

public class Count_digits {
    public static void main(String[] args) {
      
        
        int range=10;
        while(range<1000){
            int count=0;
        int rem=0;
        int result=0;
            int temp1=range;
            int temp=range;
        while (temp>0){
            count=count+1;
            temp=temp/10;
        }
        while(range>0){
            rem=range%10;
            result+=Math.pow(rem, count--);
            range=range/10;
        }
        if (temp1==result){
        System.out.println(result);
        }
        range=temp1+1;
    }
             
    }
}
