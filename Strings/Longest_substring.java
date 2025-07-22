package Strings;

public class Longest_substring {
 public static void main(String[] args) {
    String str="abcbad";
    String longest="";
    String current="";
    for(int i=0;i<str.length();i++){
        char c=str.charAt(i);
        if(current.indexOf(c)!= -1){
            current=current.substring(current.indexOf(c)+1);
        }
        current+=c;
        if(current.length()>longest.length()){
            longest=current;
        }
    }
    System.out.println(longest.length());
    System.out.println(longest);
 }   
}
