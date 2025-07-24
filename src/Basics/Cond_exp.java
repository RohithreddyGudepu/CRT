package Basics;
import java.util.Scanner;
public class Cond_exp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if( a%2==0 && b%2==0){
            System.out.println("Both are even ");
        }
        else if(a%2==0 || b%2==0){
            System.out.println("Only one is even");
        }
        else{
            System.out.println("Both number are odd");
        }
        input.close();
    }
}
