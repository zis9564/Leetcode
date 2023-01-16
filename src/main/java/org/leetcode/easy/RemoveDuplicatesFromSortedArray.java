package org.leetcode.easy;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int index = 1;
        int lastUniqueIdx = 0;
        while(index < nums.length) {
            if(nums[index] == nums[lastUniqueIdx]) {
                nums[lastUniqueIdx] = nums[index++];
            } else {
                nums[++lastUniqueIdx] = nums[index++];

            }
        }
        return lastUniqueIdx +1;
    }
}
