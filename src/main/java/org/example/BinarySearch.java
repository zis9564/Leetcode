package org.example;

public class BinarySearch {

    public int search(int[] nums, int target) {
        return search(nums, target, 0, nums.length-1);
    }

    private int search(int[] nums, int target, int start, int end) {
        //если start = end значит мы достигли предела
        if(start == end)
            //если - вернуть target, нет - вернуть -1
            return (nums[end] == target)? end : -1;
        //рассчет середины
        int mid = (start + end)/2;
        if(target > nums[mid])
            //рекурсивный вызов с пересчетом диапазона
            return search(nums, target, mid+1, end);
        if(target < nums[mid])
            //рекурсивный вызов с пересчетом диапазона
            return search(nums, target, start, mid);
        //элемент найден. вернуть индекс
        return mid;
    }
}
