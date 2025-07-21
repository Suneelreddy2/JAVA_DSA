package Arrays.Two_D;

import java.util.Arrays;

public class Columns_sort {
    public static void main(String[] args) {

    
        int[][] arr = {{5, 8, 4}, {2, 1, 0}, {7, 5, 9}};
        int[] temp=new int[3];
        for(int j=0;j<3;j++){
           for(int i=0;i<3;i++){
           temp[i]=arr[i][j];
        }
        Arrays.sort(temp);
        for(int i=0;i<3;i++){
            arr[i][j]=temp[i];
        }
    }
       System.out.println(Arrays.deepToString(arr));
  }
}
