package com.myjava.practice.string;

public class StringWordCounter {
    public int count(String inputString) {
        int counter = 0;
        if (inputString != null) {
            String[] words = inputString.split(" ");
            for(String word:words) {
                if (!word.equals("")) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
