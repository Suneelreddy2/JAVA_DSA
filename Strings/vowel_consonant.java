package Strings;

import java.util.Scanner;

public class vowel_consonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int vowel_count=0;
        int consonant_count=0;
        String vString="";
        String cString="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowel_count+=1;
                vString+=ch;
            }
            else{
                consonant_count+=1;
                cString+=ch;
            }
        }
        System.out.println("Vowel_count:"+vowel_count);
        System.out.println("consonant_count:"+consonant_count);
        System.out.println("word_with_vowels:"+vString+" || "+"word_with_consonants:"+cString);
    }
}
