package Arrays;

import java.util.Arrays;
public class Shuffle {
    public static void main(String[] args) {
        int[] arr={2,5,1,3,4,7};
        int[] res=new int[6];
        int n=3;

        for(int i=0;i<n;i++){
            res[2*i]=arr[i];
            res[2*i+1]=arr[n+i];
        
            
        }
        System.out.println(Arrays.toString(res));
    }
}
