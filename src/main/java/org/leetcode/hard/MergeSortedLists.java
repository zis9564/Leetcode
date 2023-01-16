package org.leetcode.hard;

import org.leetcode.util.Node;

public class MergeSortedLists {

    public Node mergeKLists(Node[] lists) {
        //проверка на то, что масивы не null
        if (lists == null || lists.length == 0) {
            return null;
        }
        //вызов метода по разделению листа с инициализирующими параметрами.
        return divide(lists, 0, lists.length - 1);
    }

    private Node divide(Node[] lists, int start, int end) {
        //терминальное условие если значения диапазона равны
        //вернуть элемент (начало или конец без разницы)
        if (start == end) {
            return lists[end];
        }
        //рассчитываем середину обрезая дробную часть
        int mid = start + (end - start) / 2;
        //рекурсивно вызываем метод с левой частью списка
        Node l1 = divide(lists, start, mid);
        //рекурсивно вызываем метод с правой частью списка
        Node l2 = divide(lists, mid + 1, end);
        //объединяем (сортируем) части
        return merge(l1, l2);
    }

    private Node merge(Node l1, Node l2) {
        //терминальное условие если левая часть null вернуть правую
        if (l1 == null) return l2;
        //терминальное условие если правая часть null вернуть левую
        if (l2 == null) return l1;
        //если val левой части < val право части,
        if (l1.val < l2.val) {
            //рекурсивно вызвать метод, но взять подмассив левой части
            l1.next = merge(l1.next, l2);
            //терминальное условие возвращает отсортированную левую часть
            return l1;
        }
        //если val правой части <= val левой части
        else {
            //рекурсивно вызвать метод, но взять подмассив правой части
            l2.next = merge(l1, l2.next);
            //терминальное условие возвращает отсортированную правую часть
            return l2;
        }
    }
}
