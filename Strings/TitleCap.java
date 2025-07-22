package Strings;

public class TitleCap {
    public static void main(String[] args) {
        String str="hello how are you";
        String res1="";
        String[] res=str.split(" ");
        for(String str1:res){
              res1= res1 + Character.toTitleCase(str1.charAt(0));
              res1+=str1.substring(1).toLowerCase();
              res1+=" ";
        }
        System.out.println(res1);
    }
}
