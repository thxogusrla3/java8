package design_pattern.strategy.comparator;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class ComparatorEx {
    public static void main(String[] args) {
        Integer[] arr = {4, 7, 100, 2, 6, 33523, 6345, 423, 342, 324, 652, 4};

        System.out.println(Arrays.toString(arr) + "\n");

        Arrays.sort(arr, Comparator.reverseOrder());
        System.out.println(Arrays.toString(arr) + "\n");

        Arrays.sort(arr, Comparator.naturalOrder());
        System.out.println(Arrays.toString(arr) + "\n");
    }
}
