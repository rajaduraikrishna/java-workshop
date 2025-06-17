package com.myjava.practice.string;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String sentance = "String is immurable object which stores value as byte array.";
        StringTokenizer words = new StringTokenizer(sentance, " ", true);
        System.out.println(words.countTokens());

        while (words.hasMoreElements()) {
            System.out.println(words.nextElement());
        }
    }
}
