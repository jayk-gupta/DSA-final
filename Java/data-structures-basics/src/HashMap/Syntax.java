package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Syntax {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        //  PUT
        map.put("jay", 20);
        map.put("janhvi", 15);
        map.put("ritika", 30);
        System.out.println(map);
        //  SIZE
        System.out.println(map.size()); //3
        //   GET
        getMethod(map);
        //   PUT: UPDATE
        putMethod(map);
        System.out.println(map);
    //CONTAINS
        containsMethod(map);
//        REMOVE
        removeMethod(map);
        System.out.println(map);
        System.out.println(map.containsValue(20)); // checks if there exists a value mapped to any key
        System.out.println(map.keySet()); // gives keys
        System.out.println(map.entrySet());
        System.out.println(map.values()); // gives values
//        PUT IF ABSENT
        putIfAbsentMethod(map);
        iterateMap(map);
    }

    //    GET
    static void getMethod(HashMap<String, Integer> map) {
        System.out.println(map.get("ritika")); //key: ritika , get returns value of key ritika: 30

    }

    //    PUT: UPDATE USING GET METHOD
    static void putMethod(HashMap<String, Integer> map) {
        map.put("janhvi", 12); // Replaces value of key janhvi

    }

    //    CONTAINS
    static void containsMethod(HashMap<String, Integer> map) {
        boolean ans = map.containsKey("janhvi"); // Replaces value of key janhvi
        System.out.println(ans);
    }
    //    REMOVE
    static void removeMethod(HashMap<String, Integer> map) {
       map.remove("janhvi");
    } //    REMOVE
    static void putIfAbsentMethod(HashMap<String, Integer> map) {
       map.putIfAbsent("janhvi",15);
       map.putIfAbsent("ritika",32); // this doesn't do anything as ritika key already exists
        System.out.println(map);
    }
static void iterateMap(HashMap<String, Integer> map){
// KEY
    for(String key : map.keySet()){
        System.out.printf("Birthday of %s is %d\n",key,map.get(key));
    }
    for(Map.Entry<String,Integer> e:map.entrySet()){
        System.out.printf("Birthday of %s is %d\n",e.getKey(),e.getValue());
    }
    for(var e: map.entrySet()){
        System.out.printf("Birthday of %s is %d\n",e.getKey(),e.getValue());
    }
}

/*
* To access a value must know it's KEY
* HashMap doesn't allow duplicate key , but allow VALUES
* NULL KEY : Only ONCE
* MAINTAINS NO ORDER
* */
























}
