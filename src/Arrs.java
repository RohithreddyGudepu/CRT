import java.util.Arrays;
import java.util.Scanner;
public class Arrs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num[] = {1,6,2,8,43,9,3};                                          // defining an array
        Arrays.sort(num);                                                     // sorting os array
        System.out.println("Sorted Array List is : " + Arrays.toString(num));//

        int i =0;
        int[] arr = new int[5];                                                 // runtime input of arrray
        System.out.print("Enter elements in array ");
        for(i=0; i<5;i++){
            arr[i] = in.nextInt();
            System.out.print( arr[i] + " ");

        }
        System.out.print( "Reverse arrays list is: ");
        for( i=4;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
    }
}
