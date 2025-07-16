package Arrays;

import java.util.Arrays;

public class Sort_byparity {
    public static void main(String[] args) {
        int[] arr={3,1,2,4};
        int[] res=new int[4];
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
               res[index++]=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                res[index++]=arr[i];

            }
        }
        System.out.println(Arrays.toString(res));
    }
}
