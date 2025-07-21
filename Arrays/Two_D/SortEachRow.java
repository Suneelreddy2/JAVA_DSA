package Arrays.Two_D;
import java.util.Arrays;

public class SortEachRow {
    public static void main(String[] args) {
        int[][] arr = {{5, 8, 4}, {2, 1, 0}, {7, 5, 9}};

       
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
        }

       
        
            System.out.println(Arrays.deepToString(arr));
           }
}
