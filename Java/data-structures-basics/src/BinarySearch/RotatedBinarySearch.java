package BinarySearch;


public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 0, 1, 2};
        int target = 2;
        int pivot = findPivot(arr);
        int ans = BinarySearch(arr, target, 0, pivot);
        if (ans == -1) {
            ans = BinarySearch(arr, target, pivot + 1, arr.length - 1);
        }
        System.out.println(ans);
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) return mid;
            else if (arr[mid] < arr[mid - 1]) return mid - 1;
            else if (arr[start] >= arr[mid]) end = mid - 1;
            else {
                start = mid + 1;
            }

        }
        return -1;
    }

    static int findPivotInDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) return mid;
            else if (arr[mid] < arr[mid - 1]) return mid - 1;
            else if (arr[start] >= arr[mid]) end = mid - 1;
            else {
                start = mid + 1;
            }
// if elements at middle,start,end are equal, then just skip the duplicates
            if(arr[mid]== arr[start] && arr[mid] == arr[end]){
//skip the duplicates
// Note: what if these elements at start and end were the pivots
//                check if start is pivot
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
//                check if end is pivot or not
                if(arr[end] < arr[end-1]){
                    return end;
                }
                end--;
            }
        }
        return -1;
    }

    static int BinarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) return mid;
            else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
