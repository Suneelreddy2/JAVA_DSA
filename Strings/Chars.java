package Strings;

public class Chars {
    public static void main(String[] args) {
        String str="Java";

        char[] chars=str.toCharArray();
        System.out.println(chars);
        for(char c:chars){
            System.out.print (c+" ");
        }

        byte[] bytes=str.getBytes();
        System.out.println("Bytes");
        for (byte b:bytes){
            System.out.println(b);
        }
    }
}
