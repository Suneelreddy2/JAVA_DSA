package Arrays;

public class Diff {
    public static void main(String[] args) {
        int [] arr={22,78,32,15,96,84,39,46};
        int largest=Integer.MIN_VALUE,smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length/2;i++){
            if(arr[i]>largest) largest=arr[i];
        }
        for(int i=arr.length/2;i<arr.length;i++){
            if(arr[i]<smallest) smallest=arr[i];
        }
        System.out.println(largest-smallest);
    }
}
