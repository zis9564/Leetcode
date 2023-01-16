package org.example;

public class AddBinary {

    public String addBinary(String a, String b) {
        int firstNum = Integer.parseInt(a);
        int secondNum = Integer.parseInt(b);
        StringBuilder output = new StringBuilder();
        int carry = 0;
        int temp;
        while (firstNum != 0 || secondNum != 0) {
            temp = (firstNum % 10 + secondNum % 10 + carry) % 2;
            output.append(temp);

            carry = (firstNum % 10 + secondNum % 10 + carry) / 2;
            firstNum = firstNum / 10;
            secondNum = secondNum / 10;
        }
        if (carry != 0) {
            output.append(carry);
        }
        return output.reverse().toString();
    }
}
