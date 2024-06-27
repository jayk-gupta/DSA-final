package Recursion.Questions.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearch {
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr = {1, 11,3,6,9,11};
//        System.out.println(findElement(arr, 11, 0));
      findAllIndex(arr,11,0);
        System.out.println(list);
    }

    static int findElement(int[] arr, int target, int index) {
        if (index > arr.length - 1) return -1;
        if (arr[index] == target) return index;
else{
            return findElement(arr, target, index + 1);
        }
    }

    static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);

    }
}
