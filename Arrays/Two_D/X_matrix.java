package Arrays.Two_D;

public class X_matrix {
    public static void main(String[] args) {
        int [][] arr={{1,0,0,1},{0,3,4,0},{0,40,2,0},{4,0,0,2}};
        boolean bool=true;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==j || (i+j==arr.length-1)){
                    if(arr[i][j]==0){
                        bool=false;
                        break;
                    }
                }else{
                    if(arr[i][j]!=0){
                        bool=false;
                        break;
                    }
                }
            }
        }
        System.out.println(bool);
    }
}
