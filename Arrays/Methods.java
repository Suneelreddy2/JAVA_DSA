package Arrays;

import java.util.Arrays;
public class Methods {
    public static void main(String[] args) {
        int[] arr={1,2,32,1,4,5323,45};
        int[] b_arr={1,2,32,1,4,5323,45};
        // Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.equals(arr,b_arr));

        int[] Copy=Arrays.copyOf(arr,10);
        System.out.println(Arrays.toString(Copy));

         int[] Copy_range=Arrays.copyOfRange(arr,0,11);
        System.out.println(Arrays.toString(Copy_range));

        int[] fill=new int[5];
        Arrays.fill(fill,1);
        System.out.println(Arrays.toString(fill));
        
        int []ind={1,2,3};
        int index=Arrays.binarySearch(ind, 2);
        System.out.println(index);

        int [][] nest1={{1,2},{2,3}};
        int [][] nest2={{1,2},{2,3}};
        System.out.println(Arrays.deepEquals(nest1, nest2));

    }
}
