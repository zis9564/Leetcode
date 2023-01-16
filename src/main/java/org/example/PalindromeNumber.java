package org.example;

public class PalindromeNumber {

    private int left;
    private int right;

    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
        left = x;
        right = 0;
        while (left > right) {
            addDigitToRight();
            if (left == right) {
                return areEqual();
            } else {
                removeLastLeftDigit();
            }
        }
        return areEqual();
    }

    private void addDigitToRight() {
        if (right == 0) {
            right = left % 10;
        } else {
            right = (right * 10) + (left % 10);
        }
    }

    private void removeLastLeftDigit() {
        left /= 10;
    }

    private boolean areEqual() {
        return left == right;
    }
}
