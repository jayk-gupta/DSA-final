package BinarySearch;

public class Basic {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 11, 12, 15,26};
        int target = 4;
        System.out.println(binarySearch(arr, arr.length, target));
    }

    public static int binarySearch(int[] arr, int n, int num) {
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = start + (end-start) / 2;
            if(arr[mid] == num) return mid;
            else if(num > arr[mid]) start = mid +1;
            else {
                end = mid-1;
            }
        }
        return -1;
    }
}
