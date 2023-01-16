package org.example;

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
        TwoSum obj = new TwoSum();
        System.out.println(Arrays.toString(obj.twoSum(new int[]{2, 7, 11, 15}, 26)));
    }

    private static Node[] createTestSource() {
        var n1 = new Node(1, new Node(4, new Node(5)));
        var n2 = new Node(1, new Node(3, new Node(4)));
        var n3 = new Node(2, new Node(6));
        return new Node[]{n1,n2,n3};
    }
}