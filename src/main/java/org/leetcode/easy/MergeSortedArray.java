package org.leetcode.easy;

public class MergeSortedArray {

    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        if(m == 0) {
            nums1 = moveRight(nums1, i);
            nums1[i] = nums2[j];
        }
        while(i < nums1.length && j < nums2.length) {
            if(isFirstLess(nums1[i], nums2[j]) && i < m+j) {
                i++;
            } else if(isFirstLess(nums1[i], nums2[j]) && i > m+j) {
                nums1[i] = nums2[j];
                i++; j++;
            } else {
                nums1 = moveRight(nums1, i);
                nums1[i] = nums2[j];
                j++;
            }
        }
        return nums1;
    }

    private boolean isFirstLess(int a, int b) {
        return a < b? true : false;
    }

    public int[] moveRight(int[] source, int i) {
        int current = source[i];
        int next;
        while(i < source.length-1) {
            next = source[i+1];
            source[i+1] = current;
            current = next;
            i++;
        }
        return source;
    }
}
