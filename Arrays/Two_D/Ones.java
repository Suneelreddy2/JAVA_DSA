package Arrays.Two_D;

import java.util.Arrays;

public class Ones {
    public static void main(String[] args) {
        int[][] arr={{2,5,3,4},{7,2,9,6},{17,32,4,11},{10,3,5,8}};
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(arr[i][j]%2==0) arr[i][j]=0;
                else arr[i][j]=1;
            }
       }
       System.out.println(Arrays.deepToString(arr));
        int count=0;

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(arr[i][j]==1) count+=1;
            }
            System.out.print(count+" ");
            count=0;
       }

    }
}
