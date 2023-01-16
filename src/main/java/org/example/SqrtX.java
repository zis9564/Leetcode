package org.example;

public class SqrtX {

    public int squareFactor(int x) {
        int l = 0;
        int r = x;
        int mid = 0;
        int tmp = x;
        while(l <= r) {
            mid = (l + r) / 2;
            //int squareMid = squarePow(mid);
            if(Math.pow(mid, 2) == x || mid == tmp) {
                return mid;
            }
            if(Math.pow(mid, 2) < x) {
                l = mid;
                tmp = mid;
            }
            if(Math.pow(mid, 2) > x) {
                r = mid;
                tmp = mid;
            }
        }
        return mid;
    }

    int squarePow(int x) {
        int square = x * x;
        System.out.println("mid = " + x);
        System.out.println("square mid = " + square);
        return Math.abs(square);
    }
}
