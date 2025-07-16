package Arrays;

public class l_sum {
    public static void main(String[] args) {
        int[] arr={1,3,2,6,24};
        int t_sum=0;
        for(int i:arr){
            t_sum+=i;
        }
       
        System.out.println(check(arr,t_sum));
    }
    static int check(int [] arr,int t_sum){
        int l_sum=0;
        for(int i=0;i<arr.length;i++){
            if(l_sum==t_sum-l_sum-arr[i]){
                return i;
            }
            l_sum+=arr[i];
        }
        return -1;
    
    }
}
