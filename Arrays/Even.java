package Arrays;

public class Even {
    public static void main(String[] args) {
        int[] arr={12,345,2,6,7896};
        int count=0;
        for(int i=0;i<arr.length;i++){
            count+=check(arr[i]);
        }
        System.out.println(count);
    }
    static int check(int a){
        while(a>0){
            int temp=a%10;
            if(temp%2!=0){
                return 0;
            }
            a=a/10;
        }
        return 1;
    }
}
