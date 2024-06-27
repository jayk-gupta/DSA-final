package Matrices;

import java.util.Scanner;

public class AddTwoMatrices {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number of rows");
        int r= sc.nextInt();
//        System.out.println("Enter number of cols");
        int c = sc.nextInt();

        int[][] a1 = new int[r][c] ;
        int[][] a2 = new int[r][c] ;
        int[][] ans = new int[r][c];
//        System.out.println("Enter elements of first matrix");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a1[i][j] = sc.nextInt();
            }
        }
//        System.out.println("Enter elements of second matrix");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a2[i][j] = sc.nextInt();
            }
        }
//        add matrices
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[i][j] = a1[i][j]+a2[i][j];
            }
        }
//        print ans array
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }


}
