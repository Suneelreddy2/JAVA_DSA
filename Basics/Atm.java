package Basics;
import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        if (a%100!=0 || a<0){
            System.out.println("give valid amount");
        }
        else{
            int five_hundred_notes=a/500;
            int two_hundred_notes=(a%500)/200;
            int one_hundred_notes=((a%500)%200)/100;
            if (five_hundred_notes>0) System.out.println("500 notes are:"+five_hundred_notes);
            if (two_hundred_notes>0) System.out.println("200 notes are::"+two_hundred_notes);
            if (one_hundred_notes>0) System.out.println("100 notes are"+one_hundred_notes);

        }
                 sc.close();

    }
}
