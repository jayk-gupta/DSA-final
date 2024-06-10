package Recursion.Questions;

public class BinarySearch {
    public static void main(String[] args) {
        int[] ar = {1, 4, 7, 12, 15, 23};

        int ans = binarySearch(ar, 1,0,ar.length-1);

        System.out.println(ans);
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
