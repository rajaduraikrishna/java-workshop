package com.myjava.practice.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringWordCountTest {

    @Test
    public void testWordCount() {
        StringWordCounter wordCounter = new StringWordCounter();
        int count = wordCounter.count("String is immutable object");
        Assertions.assertEquals(4, count);
    }

    @Test
    public void testWordCountBiggerString() {
        StringWordCounter wordCounter = new StringWordCounter();
        int count = wordCounter.count("String is immutable object and if you need mutable use StringBuilder");
        Assertions.assertEquals(11, count);
    }

    @Test
    public void testSingleWord() {
        StringWordCounter wordCounter = new StringWordCounter();
        int count = wordCounter.count("uncountable");
        Assertions.assertEquals(1, count);
    }

    @Test
    public void testDoubleSpace() {
        StringWordCounter wordCounter = new StringWordCounter();
        int count = wordCounter.count("String  Immurable");
        Assertions.assertEquals(2, count);
    }

    @Test
    public void testWithCommaAndSpace() {
        StringWordCounter wordCounter = new StringWordCounter();
        int count = wordCounter.count("String, char");
        Assertions.assertEquals(2, count);
    }

    @Test
    public void testWithCommaWithoutSpace() {
        StringWordCounter wordCounter = new StringWordCounter();
        int count = wordCounter.count("String,char");
        Assertions.assertEquals(1, count);
    }

    @Test
    public void testWithSpecialCharacters() {
        StringWordCounter wordCounter = new StringWordCounter();
        int count = wordCounter.count("String,@#$%^&*()char");
        Assertions.assertEquals(1, count);
    }


    @Test
    public void testWithQuotes() {
        StringWordCounter wordCounter = new StringWordCounter();
        int count = wordCounter.count("String is \"immutable\" 'Object'");
        Assertions.assertEquals(4, count);
    }

    @Test
    public void testEmptyString() {
        StringWordCounter wordCounter = new StringWordCounter();
        int count = wordCounter.count("");
        Assertions.assertEquals(0, count);
    }

    @Test
    public void testNull() {
        StringWordCounter wordCounter = new StringWordCounter();
        int count = wordCounter.count(null);
        Assertions.assertEquals(0, count);
    }
}
