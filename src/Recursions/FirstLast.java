package Recursions;

public class FirstLast {
    public static int first =-1;
    public static int last = -1;
    public static void main(String[] args) {
        String str = "abadbksdfsadjkfsaf";
        Fl(str,0,'a');
        System.out.println(first);
        System.out.println(last);
    }
    public static void Fl(String s, int idx, char element){
        if (idx == s.length()-1) {
            return;
        }

        char curr = s.charAt(idx);
        if(curr == element){
            if(first ==-1){
                first = idx;

            }
            else{
                last = idx;
            }
        }
        Fl(s,idx+1, element);
//        System.out.println(last);
    }
}
