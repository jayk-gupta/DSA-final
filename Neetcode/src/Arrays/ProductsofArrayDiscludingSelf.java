package Arrays;

import java.util.Arrays;

public class ProductsofArrayDiscludingSelf {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6};
        int[] ans = productExceptSelf(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] productExceptSelf(int[] nums) {
       int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] =1;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(i != j){
                    arr[i] *= nums[j] ;
                }
            }
        }
        return arr;
    }
}
