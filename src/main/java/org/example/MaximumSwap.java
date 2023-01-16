package org.example;

public class MaximumSwap {

    private String source;

    public void maximumSwap(int num) {
        source = String.valueOf(num);
        defineDigitRange();
    }

    private void defineDigitRange() {
        int maxDigit = -1;
        int maxDigitIndex = -1;
        int leftIndex = -1;
        int rightIndex = 1;
        for (int i = source.length() - 1; i >= 0; i--) {
            if (source.charAt(rightIndex) > maxDigit
                    || source.charAt(i) > maxDigit) {
                maxDigit = source.charAt(i);
                maxDigitIndex = i;
                continue;
            }
            if (source.charAt(i) < maxDigit) {
                leftIndex = i;
                rightIndex = maxDigitIndex;
            }
        }
        System.out.println(swapDigits(leftIndex, rightIndex));
    }

    private int swapDigits(int left, int right) {
        int result = 0;
        if (left == -1) return Integer.valueOf(source);
        for (int i = 0; i < source.length(); i++) {
            if (i == left) {
                result = result * 10 + Character.getNumericValue(source.charAt(right));
            }
            else if (i == right) {
                result = result * 10 + Character.getNumericValue(source.charAt(left));
            }
            else {
                result = result * 10 + Character.getNumericValue(source.charAt(i));
            }
        }
        return result;
    }
}
