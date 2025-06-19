package com.myjava.practice.collections;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> cseStudents = new HashMap<>();
        cseStudents.put(10001,"Raja");
        cseStudents.put(10002,"Sathish");
        cseStudents.put(10003, "Thiru");
        cseStudents.put(null, "Someone");
        cseStudents.put(10005, null);
        cseStudents.put(10006, null);
        cseStudents.put(null, "Different");
        System.out.println(cseStudents);
        System.out.println(cseStudents.keySet());
        System.out.println(cseStudents.values());
        Set<String> names = new TreeSet(Comparator.reverseOrder());
        Queue<String> admissionQueue = new LinkedList<>();
    }
}
