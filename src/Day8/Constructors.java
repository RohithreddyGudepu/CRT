package Day8;

public class Constructors {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy","pemorian");
        System.out.println(" My dog name is " + myDog.name + " and it's a " + myDog.Breed);
        myDog.bark();
    }
}
class Dog{
    String name;
    String Breed;
    public Dog(String name, String Breed) {
        this.name = name;
        this.Breed = Breed;
    }
        public void bark(){
            System.out.println(name + " says woof!");
        }
    }

