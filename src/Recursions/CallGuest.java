package Recursions;

public class CallGuest {
    public static int calljuest(int n){
        if(n<=1){
            return 1;
        }
        int s = calljuest(n-1);
        int p= (n-1)* (calljuest(n-2));
        return s+p;
    }

    public static void main(String[] args) {
        int n=4;
        System.out.println(calljuest(4));
    }
}
