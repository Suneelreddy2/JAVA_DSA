package Oops;

class Constructor{
    Constructor(){
        System.out.println(2);
    }
    Constructor(int a){
       System.out.println(a);
    }
    Constructor(int a,int b){
        System.out.println(a+b);
    }
}
public class Constructor_overloading {
    public static void main(String[] args) {
        Constructor obj1 = new Constructor();         
        Constructor obj2 = new Constructor(10);       
        Constructor obj3 = new Constructor(5, 7); 
    }
}
