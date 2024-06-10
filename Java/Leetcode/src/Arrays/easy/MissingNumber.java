package Arrays.easy;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3,2,1,4};

       int ans = missingNumber(arr);
        System.out.println(ans);
        System.out.println(Arrays.toString(arr));
    }
    public static int missingNumber(int[] nums) {
        int i = 0;
        while (i<nums.length) {
            int correctIndex= nums[i];
            if(nums[i]<nums.length && nums[i] != nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
            else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j){
                return j;
            }
        }
       return nums.length;
    }
}
