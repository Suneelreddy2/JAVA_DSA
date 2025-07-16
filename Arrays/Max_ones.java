package Arrays;

public class Max_ones {
    public static void main(String[] args) {
        int[] arr={1,1,0,1,1,1};
        int count=0,max_count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1)  count+=1;
            else count=0;
            if(count>max_count) max_count=count;
        }
        System.out.println(max_count);
    }
}
