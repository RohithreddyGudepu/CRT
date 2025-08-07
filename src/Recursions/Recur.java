package Recursions;
//A function calling itself is called as recursion function. The function should call itself to run the loop untill the loop gets exited.
public class Recur {
    public static void printrecu(int n) {
        if(n==6) return;
        System.out.println(n);
        printrecu(n+1);
    }

    public static void main(String[] args) {
        int n = 1;
        printrecu(n);
    }

}
