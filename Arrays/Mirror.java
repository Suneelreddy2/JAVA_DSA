package Arrays;

import java.util.Scanner;

public class Mirror {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(Mirror(arr,size));
    }
    static boolean Mirror(int[] arr,int size){
        if (size%2!=0) return false;
        for(int i=0;i<size/2;i++){
            if(arr[i]!=arr[size-i-1]){
                return false;
            }
        }
        return true;

    }
}
