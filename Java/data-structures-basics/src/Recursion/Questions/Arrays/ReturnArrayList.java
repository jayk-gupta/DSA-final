package Recursion.Questions.Arrays;

import java.util.ArrayList;

public class ReturnArrayList {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5,4, 4, 6};
        ArrayList<Integer> ans = findElements(arr, 4, 0, new ArrayList<>()); ArrayList<Integer> ans2 = findAllIndex(arr, 4, 0);

        System.out.println(ans);
    }

    static ArrayList<Integer> findElements(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findElements(arr, target, index + 1, list);
    }
    //////////////////////////////////////////////////////////
//    Taking array list inside the function and not in arguments
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
//        this will contain answer for that specific function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex(arr,target,index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
