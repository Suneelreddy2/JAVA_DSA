package Arrays;

public class Missing_number {
    public static void main(String[] args) {
        int[] arr={3,2,5,0,1};
        int leng=arr.length;
        int sum=(leng*(leng+1))/2;
        int arr_sum=0;
        for(int i:arr){
               arr_sum+=i;
        }
        System.out.println(sum-arr_sum);
    }
}
