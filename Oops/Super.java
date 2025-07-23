package Oops;

class First{
    int a,b;
    First(int x,int y){
        System.out.println("first class constructor");
        a=x;
        b=y;
    }
    void sum(int a,int b){
        System.out.println(a+b);
    }
}

class Second extends First{
    Second(){
        super(10,20);
        super.sum(10,20);
        System.out.println("Second class constructor");
    }
    void display(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(super.a);
        System.out.println(a*super.a);
    }
}

public class Super {
    public static void main(String[] args) {
        Second obj=new Second();
        obj.sum(20,29);
    }
}
