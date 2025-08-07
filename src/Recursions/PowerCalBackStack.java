package Recursions;

public class PowerCalBackStack {
    public static void main(String[] args) {
        int x=5;
        int n = 2;
        int result = power(x,n);
        System.out.println(result);
    }
    public static int power(int x, int n){
        if(n==0) return 1;
        int halfPower = power(x, n/2);
        if(n%2 ==0){
            return halfPower * halfPower;
        }else{
            return x* halfPower *halfPower;
        }
    }
}