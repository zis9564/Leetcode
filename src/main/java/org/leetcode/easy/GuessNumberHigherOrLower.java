package org.leetcode.easy;

public class GuessNumberHigherOrLower {

    final int target;

    public GuessNumberHigherOrLower(int num) {
        this.target = num;
    }

    public int guessNumber(int n) {
        return guessNumber(n, Integer.MAX_VALUE, 0);
    }

    public int guessNumber(int n, int lastGreater, int lastLower) {
        //n > pickedNum
        if (guess(n) < 0) {
            //обновить последний перебор
            lastGreater = n;
            //рассчитать новый n:
            // последний недобор + последни перебор-1 делить на 2
            int newN = (lastLower + n-1)/2;
            System.out.println("n: " +n+ " > target.");
            //рекурсивно вызвать метод
            return guessNumber(newN, lastGreater, lastLower);
        }
        //n < pickedNum
        if (guess(n) > 0) {
            //обновить последний недобор
            lastLower = n;
            //рассчитать новый n:
            //последний недобор + (последний перебор - последни недобор+1) делить на 2
            int newN = n + (lastGreater - n+1)/2;
            System.out.println("n: " +n+ " < target.");
            return guessNumber(newN, lastGreater, lastLower);
        }
        System.out.println("target = " + target + ".");
        return n;
    }


    int guess(int num) {
        return Integer.compare(target, num);
    }

}
