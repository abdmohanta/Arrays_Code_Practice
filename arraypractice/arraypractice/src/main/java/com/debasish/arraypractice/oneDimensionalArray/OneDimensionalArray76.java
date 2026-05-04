package com.debasish.arraypractice.oneDimensionalArray;

import java.util.*;

public class OneDimensionalArray76 {

    public static void main(String[] args) {

        // ======================================
        // PROBLEM 77: GROUP ANAGRAMS
        // ======================================

        // Step 1: input array of strings
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        // Step 2: map to group anagrams
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {

            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars); // sort characters

            String key = new String(chars);

            // add to map
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(strs[i]);
        }

        // Step 3: print grouped anagrams
        System.out.println("Grouped Anagrams:");

        for (List<String> group : map.values()) {
            System.out.println(group);
        }

    }
}