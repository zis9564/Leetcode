package org.leetcode.medium;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        while(start < end) {
            int mid = (start+end)/2;
            if((nums[mid] < nums[0]) == (target < nums[0])) {
                if(nums[mid]<target)
                    start = mid+1;
                else if(nums[mid]>target)
                    end = mid;
                else
                    return mid;
            }
            else if(target < nums[0])
                start = mid+1;
            else
                end = mid;
        }
        return -1;
    }
}
