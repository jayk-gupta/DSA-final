package Arrays.easy;

public class CheckArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 11, 21, 40, 36};
        System.out.println(checkSorted(arr, arr.length));
    }

    public static boolean checkSorted(int[] arr, int n) {
        boolean sorted = false;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] < arr[i + 1]) {
                sorted = true;
            }
            else{
                sorted = false;
            }
        }
        return sorted;
    }
}
