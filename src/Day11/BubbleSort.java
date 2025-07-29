package Day11;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {7, 8, 2, 1, 3};
        int l = arr.length;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        for (int i = 0; i < l; i++) {
            System.out.print(arr[i] + " ");

        }
        BubbleSort b = new BubbleSort();
        int result = b.SLargest(arr);
        System.out.println(result);
    }

    static int SLargest(int a[]) {

        //= { 20,10,15,17,9};
        int n = a.length;
        int largest = a[n - 1];
        for (int i = n - 1; i > 0; i--) {
            if (a[i] != largest) {
                return a[i];
            }
        }
        return -1;
    }
}