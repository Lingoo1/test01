package example;

import java.util.*;

public class MapDemo1 {

    public static void main(String[] args) {
        String str = "12ggaaa558adhhhg44uhhg22ppoi";

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println(map);

        map.forEach((k, v) -> System.out.println(k + "==>" + v));

    }

}
