package Recursions;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = { 1,2,2,3};
        boolean result = issort(arr,0);
        System.out.println(result);
    }
    public static boolean issort(int[] arr, int idx){
        if(idx == arr.length-1){
            return true;
        }

        if(arr[idx] < arr[idx+1]){
           return issort(arr, idx+1);

        }
        else{
            return false;
        }
    }
}
