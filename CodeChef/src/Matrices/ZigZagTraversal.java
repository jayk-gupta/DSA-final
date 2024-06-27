package Matrices;

import java.util.Scanner;

public class ZigZagTraversal {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number of rows");
        int r= sc.nextInt();
//        System.out.println("Enter number of cols");
        int c = sc.nextInt();
        int[][] arr = new int[r][c] ;
//        System.out.println("Enter elements of first matrix");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int j = 0 ;
        for (int i = 0; i < r; i++) {
            if(i%2!=0){
                j=c-1;
                while (j>=0){
                    System.out.print(arr[i][j]+" ");
                    j--;
                }
            }
            else{
               j=0;
               while (j<c){
                   System.out.print(arr[i][j]+" ");
                   j++;
               }
            }
            System.out.println();
        }
    }
}
