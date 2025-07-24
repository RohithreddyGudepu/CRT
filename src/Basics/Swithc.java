package Basics;
import java.util.Scanner;

public class Swithc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit;
        fruit = input.next();
        switch(fruit){
            case "Mango"-> System.out.println("It's very sweet");
            case "Apple"-> System.out.println("It's keeps doctor away");
            case "Orange"-> System.out.println("It's tasty");
            case "Guava"-> System.out.println("It's healthy");
            default -> System.out.println("It is not a fruit");
        }
    }
}
