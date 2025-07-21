package Arrays.Two_D;

public class Border {
    public static void main(String[] args) {
        int sum=0;
        int[][] arr={{1,2,3},{4,5,6},{7,8,9},{1,2,3},{4,5,6}};
        for(int i=0;i<arr.length;i+=2){
            for(int j=0;j<arr.length;j++){
                if(j==0||j==arr[0].length-1) sum+=arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
