package org.leetcode.easy;

import java.util.Arrays;

public class RemoveElement {

    public void removeElement(int[] nums, int val) {
        int index = 0;
        int length = 0;
        while(index < nums.length) {
            if(nums[index] == val) {
                //nums[length] = nums[index+1];
                index++;
            } else {
                nums[length] = nums[index];
                length++;
                index++;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(length);
        //return length;
    }
}
