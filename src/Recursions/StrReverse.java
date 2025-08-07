package Recursions;

public class StrReverse {
    public static void main(String[] args) {
        String str = "Rohith";
        Reverse(str, str.length()-1);
    }
    public static void Reverse(String s, int idx){
        if(idx<0){
            return;
        }
        System.out.print(s.charAt(idx));
        Reverse(s, idx-1);

    }
}
