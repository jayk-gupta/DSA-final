package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] ar = {1, 4, 7, 12, 15, 23};

        int ans = search(ar, 15);

        System.out.println(ans);
    }
    public static int search(int[] nums, int target) {

        return binarySearch(nums,target,0,nums.length-1);

    }
    public static int binarySearch(int[] arr, int target,int s ,int e) {
        if(s > e) return -1;
        int mid = s + (e- s) / 2;
        if(arr[mid] == target) return mid;
        else if(target > arr[mid]){
            return   binarySearch(arr,target,mid+1,e);
        }
        else {
            return binarySearch(arr,target,s,mid-1);
        }
    }

}