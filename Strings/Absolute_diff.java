package Strings;

public class Absolute_diff {
    public static void main(String[] args) {
        int f_count=0;
        int l_count=0;
        String str="venkatagiri";
        for(int i=0;i<str.length()/2;i++){
            if("aeiou".indexOf(str.charAt(i))!=-1){
                f_count+=1;
            }
        }
        for(int i=str.length()/2;i<str.length();i++){
            if("aeiou".indexOf(str.charAt(i))!=-1){
                l_count+=1;
            }
        }
        System.out.println(Math.abs(f_count-l_count));
    }
}
