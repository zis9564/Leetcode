package org.example;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        int index = digits.length-1;
        while(index >= 0 && digits[index] == 9) {
            if(index == 0) {
                return fillArray(digits.length+1);
            }
            digits[index] = 0;
            index--;
        }
        digits[index] = digits[index] +1;
        return digits;
    }

    private int[] fillArray(int length) {
        int[] result = new int[length];
        result[0] = 1;
        for(int i = 1; i < length; i++) {
            result[i] = 0;
        }
        return result;
    }
}
