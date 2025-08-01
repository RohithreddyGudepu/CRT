package Day11;

public class InsertionSort {
    void sort(int[] arr){
        for (int i = 0; i <arr.length ; i++) {

            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = key;
        }
    }
    static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
//            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] arr={12,11,13,5,6};
        InsertionSort in = new InsertionSort();
        in.sort(arr);
        printArray(arr);
    }
}
