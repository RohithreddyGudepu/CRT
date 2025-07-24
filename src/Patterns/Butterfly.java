package Patterns;

public class Butterfly {
    public static void main(String[] args) {
//        int n = 5;
//        for(int i=1; i<=n; i++){
//            for (int j = 1; j <=i; j++) {
//                System.out.print("*");
//            }
//            int space = 2*(n-i);
//            for (int j = 1; j <=space ; j++) {
//                System.out.print("_");
//            }
//            for (int j = 1; j <= i ; j++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//        for(int i=n; i>=1; i--){
//            for (int j = 1; j <=i; j++) {
//                System.out.print("*");
//            }
//            int space = 2*(n-i);
//            for (int j = 1; j <=space ; j++) {
//                System.out.print("_");
//            }
//            for (int j = 1; j <= i ; j++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }

//      Rhombus pattern
        int n=5;
        for (int i = n; i >=1 ; i--) {
            for (int j = 0; j <= n-i; j++) {
                System.out.print("_");
            }
            for (int j = 1; j<=n; j++) {
                System.out.print("0");
            }
            System.out.println();

        }

//        int n= 5;
//        int num = 1;
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 0; j <= n-i; j++) {
//                System.out.print("_");
//            }
//            for (int j = 0; j < i; j++) {
//                System.out.print(num);
//            }
//            num=num+1;
//            System.out.println();
//        }
        }
    }


