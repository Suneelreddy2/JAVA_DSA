package Strings;

public class Reverse_String {
    public static void main(String[] args) {
        String str="madaM";
        char[] arr=str.toCharArray();
        StringBuilder revString=new StringBuilder();
        int l=0;
        int r=str.length()-1;
        StringBuilder str1=new StringBuilder(str);
        revString=str1.reverse();
        // while (l<=r){
        //       revString+=str.charAt(r);
        //       r--;
        // }
        while(l<r){
            char temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        String res=new String(arr);
        System.out.println(res);
        System.out.println(res.equalsIgnoreCase(str));
    }
}
