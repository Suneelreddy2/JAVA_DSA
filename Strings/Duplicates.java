package Strings;

public class Duplicates {
    public static void main(String[] args) {
        String str="programming";
        char[] arr=str.toCharArray();
        String res="";       
        for(char ch:arr){
            if(res.indexOf(ch)==-1){
                res+=ch;
            }
        }
        System.out.println(res);
    }
}
