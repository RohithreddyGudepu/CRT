package Recursions;

public class Facctorial {
    public static void main(String[] args) {
        int n = 5;
        int result =printFact(n);
        System.out.println(result);
    }
    public static int printFact(int n){
        if(n==0) return 1;
       return n* printFact(n-1);
    }
}
