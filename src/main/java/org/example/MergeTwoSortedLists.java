package org.example;

public class MergeTwoSortedLists {

    public Node mergeTwoLists(Node l1, Node l2) {
        Node head = new Node();
        Node tail = head;
        while(l1 != null || l2 != null) {
            if(l2 == null || (l1 != null && l1.val < l2.val)) {
                tail.next = l1;
                tail = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                tail = l2;
                l2 = l2.next;
            }
        }
        return head.next;
    }
}
