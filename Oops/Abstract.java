package Oops;
abstract class First{
    abstract void sum(int a,int b);
    abstract void mul(int a,int b);
    
}
abstract class Second extends First{
    
    void sum(int a,int b){
        System.out.println("sum:"+(a+b));
    }
    abstract void mul(int a,int b);
}

class Third extends Second{
    void mul(int a,int b){
        System.out.println("mul:"+(a*b));
    }
}

public class Abstract {
    public static void main(String[] args) {
        Third obj=new Third();
        obj.sum(100,200);
        obj.mul(10,20);

    }
}
