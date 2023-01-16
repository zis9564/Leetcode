package org.example;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {

        String source = s.stripTrailing();
        return s.stripTrailing()
                .substring(source.lastIndexOf(" ", s.length())+1, source.length())
                .length();
    }
}
