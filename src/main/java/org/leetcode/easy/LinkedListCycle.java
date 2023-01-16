package org.leetcode.easy;

import org.leetcode.util.Node;

import java.util.*;

public class LinkedListCycle {

    public boolean hasCycle(Node node) {
        return hasCycle(new HashSet<>(), node);
    }

    private boolean hasCycle(Set<Node> hash, Node node) {
        //теринальное условие если лист достиг конца
        if(node == null) return false;
        //терминальное условие если лист ссылается на ноду второй раз
        if(hash.contains(node)) return true;
        //если не конец листа и не петля, добавить в сет новый элемент
        hash.add(node);
        //рекурсивно вызвать метод
        return hasCycle(hash, node.next);
    }
}
