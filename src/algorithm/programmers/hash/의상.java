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
            result *= (map.get(key) + 1); //key 옷에 대해 아무것도 입지 않았을 때 + 1
        }
        System.out.println(result - 1); //모든 옷을 입지 않은 경우 때매 -1
    }
}
