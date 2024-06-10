package Arrays.easy;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {5,4,7,9,11,13,1};
        System.out.println(findSecondLargestElement(arr));

    }
    public static int findSecondLargestElement(int[] arr){
        int max = 0;
        int max2 = 0;
        for (int k : arr) {
            if (k > max) {
                max = k;
            }
        }
        for (int j : arr) {
            if (j > max2 && j != max) {
                max2 = j;
            }
        }
        return max2;
    }
}