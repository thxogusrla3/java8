package algorithm.programmers.hash;

import java.util.*;
import java.util.stream.Collectors;

public class 의상 {
    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        Map<String, Integer> map = new HashMap<>();

        for(String[] cloth: clothes) {
            map.put(cloth[1], map.getOrDefault(cloth[1], 0) + 1);
        }

        int result = 1;
        for(String key: map.keySet()) {
            result *= map.get(key);
        }
        System.out.println(result + clothes.length);
    }
}
