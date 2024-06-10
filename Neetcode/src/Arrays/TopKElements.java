package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Given an integer array nums and an integer k, return the k most frequent elements within the array.
public class TopKElements {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3,3,3};
        int k = 2;
        int[] ans = topKFrequent(nums, k);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        int[] arr = new int[k];
        System.out.println(arr.length);
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
        int[] intValues = new int[m.size()];
        int index = 0;
        for (int value : m.values()) {
            intValues[index++] = value;
        }
        Arrays.sort(intValues);
        int i = intValues.length-1,j=0;
        for(Map.Entry<Integer,Integer> e : m.entrySet()){
          int el =  e.getKey();
          if(e.getValue() == intValues[i]){
              if (j < arr.length) { // Check if j is within bounds before adding to arr[j]
                  arr[j] = el;
                  j++;
              } else {
                  break; // Break the loop if we have filled arr
              }
          }

          i--;
        }
        System.out.println(Arrays.toString(arr));

//        Add valid elements to list



        return arr;
    }
}
