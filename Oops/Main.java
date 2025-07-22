package Oops;

class InnerMain {
        String name;
        int rollno;
        int marks;
        InnerMain(){
            String name="su";
            int rollno=123;
            int marks=986;
        }
        void display(){
            System.out.println(name+" "+rollno+" "+marks);
        }  
 }
public class Main{
    public static void main(String[] args) {
        InnerMain obj = new InnerMain();
        obj.display();
        }
}



