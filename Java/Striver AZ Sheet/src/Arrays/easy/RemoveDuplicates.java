package Arrays.easy;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,5,5,6,7,8};
        System.out.println(Arrays.toString(arr));
        System.out.println(removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));

    }

    public static int removeDuplicates(int[] nums) {
        int i=0 ,j =0,k=1;
        while(i<nums.length) {
            if(nums[i] != nums[j]){
                j++;
                nums[j] =nums[i];
                k++;
            }
            else{
                i++;
            }
        }
        return k;
    }
}
