package Arrays;

import java.util.Arrays;

public class Two_sum {
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int[] res=new int[2];
        int target=9;
        int l=0;
        int r=arr.length-1;
        while(l<r){
            int sum=arr[l]+arr[r];
            if(sum==(target)){
                res[0]=l;
                res[1]=r;
                break;
            }
            else if(sum<target){
                l++;
            }
            else r--;
        }
        System.out.println(Arrays.toString(res));
    }
}
