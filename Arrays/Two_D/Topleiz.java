package Arrays.Two_D;

public class Topleiz {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        boolean bool=true;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length-1;j++){
                if(i+1<arr.length-1 && j+1<arr[0].length-2 && arr[i][j]!=arr[i+1][j+1] ){
                    bool=false;
                }
            }
        }
        System.out.println(bool);
    }
}
