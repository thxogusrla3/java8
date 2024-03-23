package functional_interface;

import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int max = nums.length / 2;

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int num : nums) {
            hm.put(num, hm.getOrDefault(hm.get(num), 0) + 1);
        }

        if(max > hm.size()) {
            return hm.size();
        }

        return max;
    }
}