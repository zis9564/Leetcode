package org.leetcode.easy;

import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RomanToInteger {

    private final Map<Character, Integer> numberMap;
    private Integer cursor;
    private String input;

    public RomanToInteger() {
        this.numberMap = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000);
        this.cursor = 0;
    }

    public void translateRomanToInteger() {
        System.out.println("Input Roman number:");
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLine()
                .strip()
                .toUpperCase();
        scanner.close();
        if (isInputCorrect(input)) {
            System.out.println("Output: " + calculateResult());
        } else {
            System.out.println("Incorrect roman number.");
        }
    }

    private Integer calculateResult() {
        Integer result = 0;
        while (cursor < input.length()) {
            result += calculateNext(getInteger(cursor), getInteger(cursor + 1));
        }
        return result;
    }

    private Integer calculateNext(Integer first, Integer second) {
        if (second < first) {
            cursor++;
            return first;
        }
        if (second > first) {
            cursor += 2;
            return second - first;
        }
        if (second == first) {
            cursor += 2;
            return second + first;
        }
        return 0;
    }

    private Integer getInteger(Integer cursor) {
        try {
            return numberMap.get(input.charAt(cursor));
        } catch (StringIndexOutOfBoundsException e) {
            return 0;
        }
    }

    private boolean isInputCorrect(String romanNumber) {
        Pattern pattern = Pattern.compile("^[I,V,X,L,C,D,M]{1,15}$");
        return pattern.matcher(romanNumber).find();
    }
}
