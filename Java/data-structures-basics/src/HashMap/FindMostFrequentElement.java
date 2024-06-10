package HashMap;

    import java.util.HashMap;
import java.util.Map;

    public class FindMostFrequentElement {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 2,1,2,3};
            System.out.println(findNum(arr, arr.length));
        }

        public static int findNum(int[] arr, int n) {
            Map<Integer, Integer> m = new HashMap<>();
            for (int i = 0; i < n; i++) {
                if (m.containsKey(arr[i])) {
                    m.put(arr[i], m.get(arr[i]) + 1);
                } else {
                    m.put(arr[i], 1);
                }
            }
            System.out.println(m.entrySet());
            int maxFreq = -1;
            int ansKey = -1;
            for (var e : m.entrySet()) {
                if (e.getValue() > maxFreq) {
                    maxFreq = e.getValue();
                    ansKey = e.getKey();
                }
            }
            return ansKey;
        }

    }

