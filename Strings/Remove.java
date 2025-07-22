package Strings;

public class Remove {
    public static void main(String[] args) {
        String str="bacabc";
        String sub="ab";
        String[] strs=str.trim().split(sub);
        for(String str1:strs){
        System.out.print(str1);
        }
    }
}
