package com.myjava.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        Pattern namePattern = Pattern.compile("Mr.[a-zA-Z]");
        Matcher matcher = namePattern.matcher("Mr.Madasamy");
        System.out.println(matcher.find());

        String s = "Mr.Madasamy completed dip. in mechanical engineering from Sankar Polytechnic,learnt ui technologies from freshworks";
        String[] words = s.split(",|\\s");
        for(String word:words) {
            System.out.println(word);
        }
    }
}
