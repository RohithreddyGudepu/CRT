package Patterns;

public class Rhombus {
    public static void main(String[] args) {
//        int n = 4;
//        for (int i = 1; i <=n; i++) {
//            for (int j = 1; j <= n-i; j++) {
//                System.out.print("_");
//            }
//            for (int j = 0; j < 2*i-1; j++) {
//
//                    System.out.print("0");
//
//            }
//            System.out.println();
//        }
//        for (int i = n; i >=1; i--) {
//            for (int j = 1; j <= n-i; j++) {
//                System.out.print("_");
//            }
//            for (int j = 0; j < 2*i-1; j++) {
//
//                System.out.print("0");
//
//            }
//            System.out.println();
//        }

        //HALLOW RHOMBUS
        int n= 5;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print("_");
            }

            for (int j = 1; j <=n; j++) {
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("0");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
