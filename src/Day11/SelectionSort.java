package Day11;
import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 20,34,65,42,24,26};
        SelectionSort1(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void SelectionSort1(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int smallest = i;
            for (int j = i+1; j <arr.length; j++) {
                if(arr[j]<arr[smallest]){
                        smallest = j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;

        }
    }
}
