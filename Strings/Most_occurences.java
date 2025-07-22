package Strings;

public class Most_occurences {
    public static void main(String[] args) {
        String str="missisippi";
        int[] freq=new int[256]; 
        int max=0;
        char res=' ';
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            freq[c]++;
            if(freq[c]>max){
                max=freq[c];
                res=c;
            }
        }
        System.out.println(res);
        System.out.println(max);
    }
}
