package BinarySearch;

import java.util.Arrays;

public class BinarySearchTwoDArray {
    public static void main(String[] args) {
        int[][] arr = {{10, 20, 30, 40}, {11, 25, 35, 45}, {28, 29, 37, 49}, {33, 34, 38, 50},};
        int[] ans = findElement(arr, arr.length, 50);
        System.out.println(Arrays.toString(ans));
    }

    static int[] findElement(int[][] arr, int n, int target) {
        int [] ans = {-1,-1};
        int col = n - 1;
        int row = 0;
        while (row < n  && col >=0) {
            int El = arr[row][col];
            if (El == target) {
                ans[0] = row;
                ans[1] =col;
                return ans;
            } else if (El > target) {
                col--;
            } else {
//El < target
                row++;
            }
        }
        return ans;
    }
}
