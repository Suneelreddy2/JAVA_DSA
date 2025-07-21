package Arrays.Two_D;

public class Alternate_columns {
    public static void main(String[] args) {
        
    int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
    int i1=0;
    for(int i=0;i<3;i++){
    for(int j=2;j>-1;j-=2){
        System.out.print(arr[i][j]+" ");

    }
    System.err.println();
}
    }
}
