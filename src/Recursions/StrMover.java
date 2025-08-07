package Recursions;

public class StrMover {
    public static void main(String[] args) {
        String str = "axbnxddsnxh";
        strmvr(str,0,0," ");
    }
    public static void strmvr(String s, int idx, int count, String newStr){
        if(idx == s.length()){
            for (int i = 0; i < count; i++) {
                newStr += "x";
            }
            System.out.println(newStr);
            return;
        }
        char curr = s.charAt(idx);
        if(curr=='x'){
            count++;
        }
        else{
            newStr +=curr;
        }
        strmvr(s,idx+1,count,newStr);
    }
}
