package org.leetcode.easy;

import org.leetcode.util.Node;

public class RemoveDuplicatesFromSortedList {

    public Node deleteDuplicates(Node head) {
        var first = head;
        if(head == null){
            return head;
        }
        var second = head.next;
        while(second != null) {
            if(first.val == second.val) {
                first.next = second.next;
                second = second.next;
            }else{
                first = second;
                second = second.next;
            }
        }
        return head;
    }
}
