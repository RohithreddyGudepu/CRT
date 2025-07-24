package Day8;

public class SingleInheritance {
    public static void main(String[] args) {
        Dog1 myDog = new Dog1();
        myDog.bark();
        myDog.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog1 extends Animal{
    void bark(){
        System.out.println("Dog is barking");
    }
}
