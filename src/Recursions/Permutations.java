package Recursions;

public class Permutations {
    public static void main(String[] args) {
        String input = "ABC";
        permu(input," ");
    }
    public static void permu(String str, String perm) {
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String restOfString = str.substring(0, i) + str.substring(i + 1);
            permu(restOfString, perm + curr);
        }
    }
    }

