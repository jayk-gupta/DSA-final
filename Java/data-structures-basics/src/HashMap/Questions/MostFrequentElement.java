package HashMap.Questions;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentElement {
    public static void main(String[] args) {
int[] ar = {1,1,1,2,3,3,6,6,6,6,6};
int ans = mostFrequentElement(ar);
        System.out.println(ans);
    }
static int mostFrequentElement(int[] arr){
        Map<Integer,Integer> m = new HashMap<>();
//        Create map of elements and their frequencies
    for (int el : arr) {
        if (!m.containsKey(el)) {
            m.put(el, 1);
        } else {
            m.put(el, m.get(el) + 1);
        }
    }
    System.out.println(m);
//    Find max freq element
    int maxFreq=-1,ansKey = -1;
    for(var e : m.entrySet()){
        int value = e.getValue();
        if(value > maxFreq) {
            maxFreq = value;
            ansKey = e.getKey();
        }

    }
    return ansKey;
}
}
