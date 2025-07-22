package Strings;

public class Case {
    public static void main(String[] args) {
        String str="HelloWorld";
        String inp="Good Morning";
        String res="";
        for(int i=0;i<str.length();i++){
            if(i%2==0){
                char ch=str.charAt(i);
                res+=Character.toLowerCase(ch);
            } 
             else{
                char ch=str.charAt(i);
                res+=Character.toUpperCase(ch);             
            }
            
        }
  
 
    System.out.println(invert(inp));
    }
    static String invert(String inp){
        String res1="";
           char[] arr=inp.toCharArray();
           for(char ch:arr){
            if(Character.isUpperCase(ch)){
                res1+=Character.toLowerCase(ch);
            }
            else{
                res1+=Character.toUpperCase(ch);
            }
           }
           return res1;
    }
}
