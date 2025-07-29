package Day11;

import java.util.Arrays;

public class SecndLrgest {
    public static void main(String[] args) {
        SecndLrgest sl = new SecndLrgest();
        int arr[] = {20, 10, 15, 17, 9};

        int result = sl.Largest(arr);
        System.out.println(result);
    }

    static int Largest(int arr[]) {

        //= { 20,10,15,17,9};
        int n = arr.length;
        int largest = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            if (arr[i] != largest) {
                return arr[i];
            }
        }
        return -1;
    }

}
