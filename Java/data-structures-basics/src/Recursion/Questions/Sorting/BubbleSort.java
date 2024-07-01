package Recursion.Questions.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        sortArray(arr,0);
        System.out.println(Arrays.toString(arr));
    }
    static void sortArray(int[] arr,int index){

        if(index>arr.length-2){
            sortArray(arr,0);
        }else{
            if(arr[index] > arr[index+1]){
                int temp = arr[index];
                arr[index] = arr[index+1];
                arr[index+1] = temp;
            }
            sortArray(arr,index+1);
        }

    }
}
