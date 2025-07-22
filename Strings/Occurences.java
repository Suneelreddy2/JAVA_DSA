package Strings;

import java.util.Arrays;

public class Occurences {
    public static void main(String[] args) {
        String str="apple";
        char[] arr=str.toCharArray();
        int[] arr1=new int[226];
        for(char ch:arr){
             arr1[ch]++;
        }
        boolean[] printed=new boolean[256];

        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(!printed[c]){
                System.out.println(c+":"+arr1[c]);
                printed[c]=true;
            }
        }
    }
}
