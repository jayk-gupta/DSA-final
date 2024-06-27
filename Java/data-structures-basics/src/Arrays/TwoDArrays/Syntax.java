package Arrays.TwoDArrays;

public class Syntax {
    public static void main(String[] args) {
//                           [row size] [col size]
        int[][] arr = new int[4][];
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8}, {9, 10, 11, 12}};
        System.out.println(nums.length); //number of rows
//        printArray(nums);
//       Addition
        int[][] a1 = {{1, 2}, {3, 4}, {5, 6}};
        int[][] a2 = {{1, 2}, {3, 4}, {5, 6}};
//        addition(a1, a2);
//        mutiplication
multiplication(a1,a2);

    }
static  void multiplication(int[][] arr1, int[][] arr2) {
        int rows1 = arr1.length;
        int cols1 = arr1[0].length;
        int rows2 = arr2.length;
        int cols2 = arr2[0].length;
        if(cols2!=rows2) {
            System.out.println("Multiplication not possible");
        }
        int[][] arr3 = new int[arr1.length][];
    for (int i = 0; i < arr1.length; i++) {
        for (int j = 0; j < arr1[i].length; j++) {
            for (int k = 0; k < arr1[i].length; k++) {
                arr3[i][j] = arr1[i][k] + arr2[k][i];
            }

        }
    }
    printArray(arr3);
}
//addition
    static void addition(int[][] arr1, int[][] arr2) {
        int[][] arr3 = new int[arr1.length][];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = new int[arr1[i].length];
            for (int j = 0; j < arr1[i].length; j++) {
                arr3[i][j] += arr1[i][j] * arr2[i][j];
            }
        }
        printArray(arr3);
    }


    static void printArray(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();

        }
    }

}
