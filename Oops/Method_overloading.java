package Oops;

class Overload{
    int method(int n){
        return n;
    }
    float method(float a,float b){
        return a+b;
    }
}
public class Method_overloading {
    public static void main(String[] args) {
        Overload obj=new Overload();
        System.out.println(obj.method(10));
        System.out.println(obj.method(10.0f,20.0f));
    }

    
}
