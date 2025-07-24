package Day_5;
import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
//        for (int i = 0; i < 4; i++) {
//            System.out.print("0");
//
//            for (int j = 0; j < 5; j++) {
//                System.out.print("0");
//            }
//            System.out.println();
//
//        }
//        for (int i = 1; i <= 4; i++) {
//            System.out.print("0");
//            if(i==1 || i==4) {
//                for (int j = 0; j < 4; j++) {
//                    System.out.print("0");
//
//                }
//            }
//                if(i== 2  || i==3) {
//                    for (int j = 0; j < 4; j++) {
//                        if (j == 3) {
//                            System.out.print("0");
//                        }
//                        else{
//                            System.out.print(" ");
//                        }
//                    }
//
//                }
//            System.out.println();
//        }
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int i =1; i<=10; i++){
            int result = N * i;
            System.out.println(N + "*" + i +"="+ result);
        }
            }
        }
