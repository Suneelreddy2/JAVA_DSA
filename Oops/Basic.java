package Oops;

    class St{
         String name;
         int rollno;
         double mark;
         void display(String name,int rollno,double marks){
            System.out.println(name+" "+rollno+" "+marks);
        }
       
    }
    class St1{
         String name="su";
         int rollno=123;
         int marks=986;
         void display(String name,int rollno,double marks){
            System.out.println(name+" "+rollno+" "+marks);
        }
       
    }
    public class Basic {
    public static void main(String[] args) {
        St obj=new St();
        St1 obj1=new St1();
        // obj.display("suneel",123,99.7);
        // obj.display("sita",122,90);
        System.out.println(obj1.name);
    }
}
