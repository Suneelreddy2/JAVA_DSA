package Oops;

class Animal {
    void sound() {
        System.out.println("Animals ");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("it barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("it meow");
    }
}

public class Poly {
    public static void main(String[] args) {
        Animal a;
       a = new Animal();
       a.sound();

        a = new Dog();
        a.sound();  // should print "it barks"

        a = new Cat();
        a.sound();  // should print "it meow"
    }
}
