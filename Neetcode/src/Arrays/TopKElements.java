package Arrays;

import java.util.Arrays;
import java.util.HashMap;

//Given an integer array nums and an integer k, return the k most frequent elements within the array.
public class TopKElements {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3, 3, 3};
        int k = 2;
        int[] ans = topKFrequent(nums, k);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        int[] arr = new int[k];
        HashMap<Integer, Integer> m = new HashMap<>();
//        Add frequency of each element and map to that element
        for (int i = 0; i < nums.length; i++) {
            if (m.containsKey(nums[i])) {
                m.put(nums[i], m.get(nums[i]) + 1);
            } else {
                m.put(nums[i], 1);
            }
        }
        System.out.println(m);
//        SORT frequency i.e. values
        int max1 = -1, max2 = -1, key1 = Integer.MIN_VALUE,key2 = Integer.MIN_VALUE;
        for (var e : m.entrySet()) {
         int value =  e.getValue();
         int key = e.getKey();
         if(value > max1){
             max1 = value;
             key1=key;
         }
         if(value>=max1 && value>max2){
             max2 = value;
             key2=key;
         }
        }

//        Add valid elements to list


        return arr;
    }
}
