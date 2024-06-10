package Arrays;

//Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

import java.util.HashMap;

public class DuplicateInteger {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3};
        System.out.println(hasDuplicate(nums));
    }
    public static  boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
        return true;
            } else {
                map.put(nums[i], 1);
            }
        }
        return false;
    }
}
