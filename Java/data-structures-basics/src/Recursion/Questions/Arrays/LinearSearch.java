package Recursion.Questions.Arrays;

import java.util.ArrayList;

public class LinearSearch {
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr = {1, 12, 6, 19, 21, 29, 12};
        System.out.println(findElement(arr, 29, 0));
    }

    static int findElement(int[] arr, int target, int index) {
        if (index > arr.length - 1) return -1;
        if (arr[index] == target) return index;

        return findElement(arr, target, index + 1);
    }

    static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, index, index + 1);

    }
}
