package com.core.java.samples;

import java.util.*;

public class CollectionSample {
    public static void main(String[] args) {
        // List example
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Javascript");

        for (String fruit : list) {
            System.out.println(fruit);
        }

        // Set example
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10); // Duplicate, will not be added

        System.out.println(set);

        // Map example
        Map<String, Integer> map = new HashMap<>();
        map.put("Docker", 1);
        map.put("Helm", 2);
        map.put("Kubernetes", 3);

        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
