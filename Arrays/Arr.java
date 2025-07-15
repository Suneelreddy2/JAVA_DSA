package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int even_sum=0,odd_sum=0;
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            }
        for(int i=0;i<n;i++){
              if(i%2==0){ even_sum+=arr[i];
            }
              else{
                odd_sum=arr[i];
            }
        }
        
        System.out.println(+even_sum+" " +odd_sum);
        System.out.println(odd_sum-even_sum);
        System.out.println(even_sum-odd_sum);


        
        }


        
}
