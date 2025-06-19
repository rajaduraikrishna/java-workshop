package com.myjava.practice.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SequencedCollection;
import java.util.function.Predicate;

public class ListExample {

    public static void main(String[] args) {
        List<String> names= new ArrayList<>();
        names.add("Raja");
        names.add("Sathish");
        names.add("Thiru");
        System.out.println(names);
        names.remove("Raja");
        System.out.println(names);
        names.add(0,"Raja");
        System.out.println(names);

        System.out.println(names.indexOf("Thiru"));
        names.forEach(System.out::println);
        names.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("S");
            }
        });
//        System.out.println(names);
        Iterator<String> nameIterator = names.iterator();
        nameIterator.forEachRemaining(System.out::println);
        while(nameIterator.hasNext()) {

            System.out.println(nameIterator.next());

        }


    }
}
