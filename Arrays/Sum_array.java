package Arrays;
import java.util.Arrays;
public class Sum_array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            arr[i]=sum;
        }
        System.out.println(Arrays.toString(arr));
    }
}
