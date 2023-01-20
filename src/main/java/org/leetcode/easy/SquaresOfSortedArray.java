package org.leetcode.easy;

import java.util.Arrays;

public class SquaresOfSortedArray {

    public int[] sortedSquares(int[] input) {
        int point = 0;
        for(int i=0; i < input.length; i++) {
            if(point == 0 && input[i] >= 0) {
                point = i;
            }
            input[i] = (int) Math.pow(input[i], 2);
        }
        return sortArray(input, point);
    }

    private int[] sortArray(int[] powArr, int point) {
        int[] result = new int[powArr.length];
        int resultInd = 0;
        int negativeInd = point-1;
        while(point < powArr.length && negativeInd >= 0) {
            int negativeVal = powArr[negativeInd];
            int positiveVal = powArr[point];
            if(positiveVal < negativeVal) {
                result[resultInd] = positiveVal;
                resultInd++;
                point++;
            } else {
                result[resultInd] = negativeVal;
                resultInd++;
                negativeInd--;
            }
        }
        while(point < powArr.length) {
            Arrays.sort(powArr);
            result[resultInd] = powArr[point];
            resultInd++;
            point++;
        }
        while(negativeInd >= 0) {
            result[resultInd] = powArr[negativeInd];
            resultInd++;
            negativeInd--;
        }
        return result;
    }
}
