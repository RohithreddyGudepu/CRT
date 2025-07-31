package Bitwise;

public class Clear {
    public static void main(String[] args) {
        int n = 5;
        int pos =2;
        int bitmask = 1<<pos;
        int notbitmask = ~(bitmask);
        int newNum = notbitmask & n;
        System.out.println(newNum);
        int a = 11;
        int b = 14;
        a = a^b;
        b = b^a;
        a = a^b;
        System.out.println(a);
        System.out.println(b);
    }
}
