package Day_5;

public class Pattern {
    public static void main(String[] args) {



//        int n = 4;
//        for (int i = 4; i>0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.println(" ");
//            }
//            for (int j = 0; j < ; j++) {
//
//            }
//            System.out.println();
//            }




//        for (int i = 1; i <= 5; i++) {
//
//            for (int j = 1; j <=i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

//        output
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5



//        for (int i = 5; i >= 1; i--) {
//            for (int j = 1; j <=i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//        int n = 4;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <n-i; j++) {
//
//            }
//        }



//        int n=5;
//        int num =15;
//        for (int i = n; i>=1 ; i--) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(num +" ");
//                num = num-1;
//            }
//            System.out.println();
//        }
//
//


        //Floyed Triangle

//        int m=5;
//        for (int i = 1; i <=5 ; i++) {
//            for (int j = 1; j <=m-i ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        int i = 210101;
//        while(i!=2) {
//            int num = i % 10;
//            System.out.print(num+" ");
//            i = i/10;
//            System.out.println();
//        }

//
//        0=1 Triangle
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <=i ; j++) {
                int sum = i+j;
                if(sum%2==0){
                    System.out.print(1+" ");
                }
                else{
                    System.out.print(0+" ");
                }

            }
            System.out.println();
        }
    }
}
