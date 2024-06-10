package BinarySearch.easy;

import java.util.Arrays;

public class SpecialArrayWithXElementGreaterThanX {
    public static void main(String[] args) {
        int[] nums = {3, 4, 7};
        System.out.println(specialArray(nums));
    }

    public static int specialArray(int[] nums) {
        Arrays.sort(nums);
        int ans = binarySearch(nums, nums.length);
        return ans;

    }

    public static int binarySearch(int[] arr, int n) {
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int ansNums = end - mid + 1;
            if (arr[mid] == ansNums) return arr[mid];
            else if(ansNums > arr[mid]){
                start = mid + 1;
            }
            else{
                return -1;
            }
        }
        return -1;
    }
}
