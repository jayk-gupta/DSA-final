package Arrays.medium;

public class SearchTwoMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        System.out.println(arr.length);
        int target = 60;
        System.out.println(searchMatrix(arr, target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = 0; //row
        int n = matrix[0].length-1; //col
        while (m<matrix.length && n>=0){
            int El = matrix[m][n];
            if(El==target){
                System.out.printf("m: %d, n: %d%n", m, n);
                return true;
            }
            else if(El<target){
                m++;
            }
            else{
                n--;
            }
        }
        return false;
    }
}
