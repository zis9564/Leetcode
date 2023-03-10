package org.leetcode.easy;

import java.util.regex.Pattern;

public class LongestCommonPrefix {

    private String[] inputArray;

    public void getLognestCommotPrefix(String[] strs) {
        inputArray = strs;
        int charIndex = 0;
        if (validateInputArray(inputArray)) {
            while(checkRow(charIndex)) {
                charIndex++;
            }
        }
        System.out.println(inputArray[0].substring(0, charIndex));
    }

    private boolean checkRow(int charIndex) {
        for (int arrayIndex = 0; arrayIndex < inputArray.length-1; arrayIndex++) {
            if (!compareTwoChars(arrayIndex, charIndex)) {
                return false;
            }
        }
        return true;
    }

    private boolean compareTwoChars(Integer arrayIndex, Integer charIndex) {
        try {
            if(inputArray[arrayIndex].charAt(charIndex) == inputArray[arrayIndex + 1].charAt(charIndex)) {
                return true;
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

    private boolean validateInputArray(String[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            if (!isInputCorrect(inputArray[i])) {
                return false;
            }
        }
        return true;
    }

    private boolean isInputCorrect(String word) {
        Pattern p = Pattern.compile("^[a-z]{0,200}$");
        return p.matcher(word).find();
    }
    //
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        int minLen = Integer.MAX_VALUE;
        for (String str : strs)
            minLen = Math.min(minLen, str.length());
        int low = 1;
        int high = minLen;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (isCommonPrefix(strs, middle))
                low = middle + 1;
            else
                high = middle - 1;
        }
        return strs[0].substring(0, (low + high) / 2);
    }

    private boolean isCommonPrefix(String[] strs, int len) {
        String str1 = strs[0].substring(0, len);
        for (int i = 1; i < strs.length; i++)
            if (!strs[i].startsWith(str1))
                return false;
        return true;
    }
}
