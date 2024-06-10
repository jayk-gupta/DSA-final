package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] ar = {4,5,1,2,3};
        sort(ar);
        System.out.println(Arrays.toString(ar));
    }
    static void sort(int[] arr){
        int  max= Integer.MIN_VALUE;
        int maxIndex = 0;
        for (int i = 0; i < arr.length-1; i++) {
            int correctIndex = arr.length-i-1;
            for (int j = 0; j <arr.length-i ; j++) {
                if(arr[j] >max){ max = arr[j];
                maxIndex = j;
                }
            }
            int temp = arr[correctIndex];
            arr[correctIndex] = max;
            arr[maxIndex] = temp;
            max= Integer.MIN_VALUE;
        }
    }
}
