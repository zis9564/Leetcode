package org.example;

public class AddTwoNumbers {
    int extra = 0;
    Node result = new Node();

    public Node addTwoNumbers(Node l1, Node l2){
        return addTwoNumbers(result, l1, l2);
    }

    public Node addTwoNumbers(Node tali, Node l1, Node l2) {
        //теринальное условие -> если l1, l1 и extra == null вернуть результирующий лист
        if(l1 == null && l2 == null && extra == 0) return this.result;
        //если l1 = null переменная 0, иначе значение l1
        int l1val = (l1 == null)? 0 : l1.val;
        //если l2 = null переменная 0, иначе значение l2
        int l2val = (l2 == null)? 0 : l2.val;
        //сумма переменных и extra
        int sum = l1val + l2val + extra;
        //если сумма >= 10 в tail записываем остаток от деления и ставим extra = 1
        if(sum >= 10) {
            tali.val = sum % 10;
            extra = 1;
        }
        //если сумма < 10 в tail записываем остаток от деления и ставим extra = 0
        if(sum < 10) {
            tali.val = sum;
            extra = 0;
        }
        //(l1 или l1.next != null) или (l2 или l2.next != null) или (extra != 0)
        if(!(l1 == null || l1.next == null) || !(l2 == null || l2.next == null) || extra != 0) {
            //в случае если нет next, создать.
            if(tali.next == null) tali.next = new Node();
            //рекурсивно вызвать метод с опциональными параметрами
            return addTwoNumbers(tali.next,
                    l1 != null ? l1.next : null,
                    l2 != null ? l2.next : null);
        }
        return addTwoNumbers(null, null, null);
    }
}
