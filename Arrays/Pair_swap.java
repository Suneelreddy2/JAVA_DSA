package Arrays;

import java.util.Arrays;

public class Pair_swap {
    public static void main(String[] args) {
        int [] arr={22,78,32,15,96,84,39,46};
        for(int i=0;i<arr.length-1;i+=2){
        
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;

         
        }
        System.out.println(Arrays.toString(arr));

    }
}
