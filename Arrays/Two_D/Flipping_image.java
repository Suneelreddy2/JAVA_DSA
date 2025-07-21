package Arrays.Two_D;

import java.util.Arrays;

public class Flipping_image {
    public static void main(String[] args) {
        int[][] arr={{1,1,0},{1,0,1},{0,0,0}};
        for(int i=0;i<arr.length;i++){
            for(int j=arr[0].length-1;j>-1;j--){
                System.out.print((arr[i][j]^1)+" ");
            }
            System.out.println();
        }
        
      
    }
}
