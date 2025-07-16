package Arrays;

import java.util.Arrays;

public class Smaller {
    public static void main(String[] args) {
        int c=0;
        int[] res=new int[5];
        int[] arr={8,1,2,2,3};
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if (arr[j]<arr[i] ){
                    c+=1;
                }

            }
           res[i]=c;
           c=0;
        }
        System.out.println(Arrays.toString(res));
    }
}
