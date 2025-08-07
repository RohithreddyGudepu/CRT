package Recursions;

public class Palindrome {
    public static void main(String[] args) {
        String s = "madam";
        boolean result =ispal(s, 0,s.length()-1);
        System.out.println(result);
    }
    public static boolean ispal(String s, int start, int end){
        int n = s.length();

        if(start >= end){
            return true;
        }
        if(s.charAt(start)!= s.charAt(end)){
            return false;
        }
        return ispal(s, start+1, end-1);
    }
}
