package Arrays.easy;

import java.util.HashMap;

public class ContainsDuplicateTwo {
    public static void main(String[] args) {
       int[] nums = {1,2,3,1,2,3};
               int k = 2;

    }
    public boolean containsNearbyDuplicate(int[] nums, int k) {
// 
        HashMap<Integer,Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            m.put(i,nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if(m.containsValue(nums[i])){
                
            }
        }
    }
}
