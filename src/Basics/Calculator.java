package Basics;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter two numbers : ");
        int num = input.nextInt();
        int num2 = input.nextInt();
        System.out.print("Enter the operator : ");
        char op = input.next().trim().charAt(0);
        if(op == '+' || op == '-' || op == '*' || op == '/') {
            switch (op) {
                case '+' -> System.out.println("sum of two numbers is: " + (num + num2));
                case '-' -> System.out.println("Difference between two number is : " + (num-num2));
                case '*'-> System.out.println("Product of two numbers is: " + (num*num2));
                case '/' -> {
                    if(num2!=0){
                        System.out.println("Division is : " + (num / num2));
                    }
                    else{
                        System.out.println("Division not possible");
                    }
                }
                default -> System.out.println(" Enter valid operation");
            }
        }
}
    }
