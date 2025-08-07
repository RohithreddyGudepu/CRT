package Recursions;

public class SumNaturals {
    public static void main(String[] args) {
        int ans = Sum(1);
        System.out.println(ans);
    }
    public static int Sum(int a){
        if(a>20) return 0;
        return a+Sum(a+1);
    }
}
