package Arrays.medium;

import java.util.Arrays;
//XX: TLE
public class RotateArrayRightByk {
    public static void main(String[] args) {
int[] nums = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(nums));
        rotate(nums,3);
        System.out.println(Arrays.toString(nums));
    }
    public static void rotate(int[] nums, int k) {
        int temp = 0;
        for (int i = 0; i < k; i++) {
            temp = nums[nums.length-1];
            for (int j = nums.length-2 ; j >=0 ; j--) {
              nums[j+1] = nums[j];
            }
            nums[0] = temp;
        }


    }
}
