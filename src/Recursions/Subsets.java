package Recursions;
import java.util.*;
public class Subsets {
    public static void printsubset(int[] nums, int idx, List<Integer> current){
        if(idx == nums.length){
            System.out.println(current);
            return;
        }
        current.add(nums[idx]);
        printsubset(nums, idx+1, current);
        current.remove(current.size()-1);
        printsubset(nums, idx+1, current);
    }

    public static void main(String[] args) {
        int n=3;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i+1;
        }
        printsubset(nums, 0,new ArrayList<>());
    }
}
