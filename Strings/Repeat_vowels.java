package Strings;

public class Repeat_vowels {
    public static void main(String[] args) {
        String str="hello";
        char[] arr=str.toCharArray();
        String res="";
        for(char ch:arr){
            int index="aeiou".indexOf(ch);
            if(index!=-1){
                int index1=str.indexOf(ch);
                for(int i=0;i<index1;i++){
                    res+=ch;
                }
            }
      
                res+=ch;
            
        }
        System.out.println(res);

    }
}
