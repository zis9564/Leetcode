package org.leetcode;

import org.leetcode.easy.SquaresOfSortedArray;
import org.leetcode.easy.TwoSum;
import org.leetcode.medium.MergeIntervals;
import org.leetcode.util.Node;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        MergeSortedLists obj = new MergeSortedLists();
//        LinkedListCycle obj = new LinkedListCycle();
//        AddTwoNumbers obj = new AddTwoNumbers();
//        ReverseLinkedList obj = new ReverseLinkedList();
//        BinarySearch obj = new BinarySearch();
//        GuessNumberHigherOrLower obj = new GuessNumberHigherOrLower(1);
//        Search2DMatrix obj = new Search2DMatrix();
//        SearchInRotatedSortedArray obj = new SearchInRotatedSortedArray();
//        SingleNumber obj = new SingleNumber();
//        TwoSum obj = new TwoSum();
        SquaresOfSortedArray obj = new SquaresOfSortedArray();
//        MergeIntervals obj = new MergeIntervals();
        obj.sortedSquares(new int[]{-5,-3,-2,-1});
    }
    private static Node[] createTestSource() {
        var n1 = new Node(1, new Node(4, new Node(5)));
        var n2 = new Node(1, new Node(3, new Node(4)));
        var n3 = new Node(2, new Node(6));
        return new Node[]{n1,n2,n3};
    }
}