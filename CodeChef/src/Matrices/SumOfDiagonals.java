package Matrices;

import java.util.Scanner;

public class SumOfDiagonals {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int primarySum = 0,secondarySum = 0;
        int n = N-1;
// diagonal sum
//        primary sum
        for (int i = 0; i <N; i++) {
            primarySum += arr[i][i];
        }
//        secondary sum
//        if n is odd the center element will come twice in sum so exclude that
        for (int i = 0; i < N; i++) {
          if(N%2 != 0 ){
//              skip center element
              if(i==N/2) continue;
          }
          secondarySum += arr[i][n-i];
        }
        System.out.println(primarySum+secondarySum);
    }
}
