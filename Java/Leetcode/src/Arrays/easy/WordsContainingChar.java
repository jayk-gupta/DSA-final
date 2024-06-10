package Arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class WordsContainingChar {
    public static void main(String[] args) {
        String[] words = {"leet","code","cat","love","cg","apple"};
        char x = 'e';
        List<Integer> l = findWordsContaining(words,x);
        System.out.println(l);


    }
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>(5);
        for (int i = 0; i < words.length; i++) {
            if(words[i].indexOf(x) != -1){
                list.add(i);
            }
        }
        return list;
    }
}
