package org.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++) {
            Integer complimentInd = map.get(nums[i]);
            if(complimentInd != null)
                return new int[]{complimentInd,i};
            map.put(target-nums[i], i);
        }
        return nums;
    }
}
