package Recursion.Questions.Arrays;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,13};
        System.out.println(checkSorted(arr,0));
    }
    static boolean checkSorted(int[] arr,int index){
        if(index == arr.length-1) return true;
       boolean isSorted  = arr[index] < arr[index+1];
       return isSorted && checkSorted(arr,index+1);


    }
}
