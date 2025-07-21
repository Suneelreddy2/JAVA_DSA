package Arrays.Two_D;

import java.util.Arrays;

public class Alternate_rows {
    public static void main(String[] args) {
        //rows=arr.length/2 cols=arr[0].length 
        int[][] arr={{1,2},{3,4},{5,6}};
        int[][] res=new int[2][1];
        int i1=0;
        int i2=0;
        for(int i=2;i>-1;i-=2){
            res[i1]=arr[i];
            i1++;
             
                    }
        System.out.println(Arrays.deepToString(res));
    }
}
