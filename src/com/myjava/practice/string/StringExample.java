package com.myjava.practice.string;

import java.util.Date;

public class StringExample {
    public static void main(String[] args) {
        String sentance = "String is immurable object which stores value as byte array.";
        String []words = sentance.split(" ");
        System.out.println(words.length );
        System.out.println(sentance.length());
        String newSentance = sentance.replace(" ","");
        System.out.println(newSentance.length());
    }
}
