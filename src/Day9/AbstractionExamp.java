package Day9;

public class AbstractionExamp {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
        d.sleep();
        Cat c = new Cat();
        c.makeSound();
        c.sleep();
    }
}
abstract class Animal{
    abstract void makeSound();
    void sleep(){
        System.out.println("zzzzzzz...");
    }
}
class Dog extends Animal{
    void makeSound(){
        System.out.println("Dog  barks: Bow! bow!");
    }
}
class Cat extends Animal{
    void makeSound(){
        System.out.println("Cat sounds: Meow! Meow!");
    }
}

