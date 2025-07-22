package Strings;

import java.util.Arrays;

public class Occurences {
    public static void main(String[] args) {
        String str="apple";
        char[] arr=str.toCharArray();
        int[] arr1=new int[26];
        for(char ch:arr){
             arr1[ch-97]++;
        }
        char ch='a';
        for(int i:arr1){
            if(i>0) System.out.println(ch+":"+i );
            ch++;
        }
    }
}
