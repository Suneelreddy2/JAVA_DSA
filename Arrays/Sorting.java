package Arrays;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int [] arr={22,3,0,5,0,67};
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length/2;j++){
        //         if(arr[i]>arr[j]){
        //             int temp=arr[j];
        //             arr[j]=arr[i];
        //             arr[i]=temp;
        //         }
        //     }
        // }
        // for(int i=arr.length/2;i<arr.length;i++){
        //     for(int j=arr.length/2;j<arr.length ;j++){
        //         if(arr[i]>arr[j]){
        //             int temp=arr[j];
        //             arr[j]=arr[i];
        //             arr[i]=temp;
        //         }
        //     }
        // }
        // Binaryarray(arr);
        Moving_zeroes(arr);
        
    
     }
    // static void Binaryarray(int[] arr){
    
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]%2==0){
    //            arr[i]=0;
    //         }
    //         else arr[i]=1;
    //     }
    //     System.out.println(Arrays.toString(arr));

    // }

    static void Moving_zeroes(int[] arr){
        // int index=0;
        // for(int i=0;i<arr.length;i++){
        //       if(arr[i]!=0){
        //         arr[index++]=arr[i];
        //       }
        // }
        // for(int i=index;i<arr.length;i++){
        //     arr[index++]=0;
             
        // }
         int index=arr.length-1;
        for(int i=arr.length-1;i>-1;i--){
              if(arr[i]!=0){
                arr[index--]=arr[i];
              }
        }
        for(int i=index;i>-1;i--){
            arr[index--]=0;
             
        }
                System.out.println(Arrays.toString(arr));

    }
}