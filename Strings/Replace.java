package Strings;

public class Replace {
    public static void main(String[] args) {
        String str="nellore";
        char[] arr=str.toCharArray();
        for(char ch:arr){
            if("aeiou".indexOf(ch)!=-1){
                str=str.replace(ch,'@');
            }
        }
        System.out.println(str);
    }
}
