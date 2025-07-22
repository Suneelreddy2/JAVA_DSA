package Strings;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String str1="silent";
        char[] arr1=str1.toCharArray();
        String str2="listen";
        boolean bool=true;
        char[] arr2=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1, arr2)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

    }
}
