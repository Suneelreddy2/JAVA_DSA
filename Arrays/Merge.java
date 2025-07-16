package Arrays;

import java.util.Arrays;

public class Merge {
    public static void main(String[] args) {
        int [] a_arr={1,3,2};
        int [] b_arr={2,3,5};
         a_arr=Arrays.copyOf(a_arr, a_arr.length+b_arr.length);
        for(int i=0;i<b_arr.length;i++){
            a_arr[b_arr.length+i]=b_arr[i];
        }
        Arrays.sort(a_arr);
        System.out.println(Arrays.toString(a_arr));
    }
}
