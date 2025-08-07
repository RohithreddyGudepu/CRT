package Recursions;

public class Fibonacci {
    public static void main(String[] args) {
        printFib(0,1);
    }
    public static void printFib(int a, int b){
        System.out.print(a + " ");
         if(a>15) return;
        printFib(b, a+b);

    }
}
