package Arrays;

import java.util.Arrays;

public class TwoIntegerSum {
    public static void main(String[] args) {
int[] a = {3,4,5,6};
        System.out.println(Arrays.toString(twoSum(a,10)));
    }
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
