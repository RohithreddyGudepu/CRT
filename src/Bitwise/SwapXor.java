package Bitwise;

public class SwapXor {
    static void Swap(int[] arr){
        if(arr.length <2){
            System.out.println("Atleast two number are required to swap ");
            return;
        }
        arr[0] = arr[0]^arr[1];
        arr[1] = arr[1]^arr[0];
        arr[0] = arr[1]^arr[0];
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }

    public static void main(String[] args) {
        int[] arr ={10,15};
        Swap(arr);
    }
}
