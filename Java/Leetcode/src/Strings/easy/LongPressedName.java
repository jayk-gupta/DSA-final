//package Strings.easy;
//
//import java.util.HashMap;
//
//public class LongPressedName {
//    public static void main(String[] args) {
//        String name = "alex", typed = "aaleex";
//        System.out.println(isLongPressedName(name, typed));
//    }
//
//    public static boolean isLongPressedName(String name, String typed) {
//        HashMap<Character, Integer> m1 = new HashMap<>();
//        HashMap<Character, Integer> m2 = new HashMap<>();
//        for (int i = 0; i < name.length(); i++) {
//            if (!m1.containsKey(name.charAt(i))) {
//                m1.put(name.charAt(i), 1);
//            } else {
//                m1.put(name.charAt(i), m1.getOrDefault(name.charAt(i)) + 1);
//            }
//        }
//        System.out.println(m1);
//        for (int i = 0; i < typed.length(); i++) {
//            if (!m2.containsKey(name.charAt(i))) {
//                m2.put(name.charAt(i), 1);
//            } else {
//           m2.put( m2.getOrDefault(name.charAt(i),name.charAt(i)) + 1));
//            }
//        }
//        System.out.println(m2);
//        return true;
//    }
//
//
//}
