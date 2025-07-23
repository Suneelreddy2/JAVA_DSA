package Oops;

class Student{
    private String Name;
    private int rollno;
    public void setName(String name){
        Name=name;
        
    }
    public String getName(){
       return Name;
        
    }
    public void setrollno(int roll){
        rollno=roll;
    }
    public int getrollno(){
        return rollno;
    }

}
public class Encapsulation {
    public static void main(String[] args) {
        Student s=new Student();
        s.setName("Suneel");
        System.out.println(s.getName());
         s.setrollno(123);
        System.out.println(s.getrollno());
    }
}
