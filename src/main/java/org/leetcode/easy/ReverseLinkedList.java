package org.leetcode.easy;

import org.leetcode.util.Node;

public class ReverseLinkedList {

    Node result;

    public Node reverseList(Node head) {
       return reverseList(head, null);
    }

    public Node reverseList(Node head, Node prev) {
        //терминальное условие если последний элемент в листе
        if(head.next == null) {
            //записываем последний элемент как результат
            result = head;
            //создаем новую ноду с val предыдущей и назначаем как next у результата
            head.next = new Node(prev.val);
            //возвращаем next;
            return head.next;
        }
        //терминальное условие если достигли первого элемента
        if(prev == null) {
            return result;
        }
        //записать возвращенный следующий элемент
        var r = reverseList(head.next, head);
        //к возвращенному элементу добавить предыдущий элемент из аргумента как next
        r.next = new Node(prev.val);
        //вернуть next
        return r.next;
    }
}
