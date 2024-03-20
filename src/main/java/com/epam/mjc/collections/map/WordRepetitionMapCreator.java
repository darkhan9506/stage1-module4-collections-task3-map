package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public static Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> resMap = new HashMap<>();
        if (sentence.length() == 0) return resMap;
        String[] arr = sentence.toLowerCase().split(" |\\.|, |,");
        for (String s : arr) {
            Integer count = resMap.get(s);
            if (count == null) {
                resMap.put(s, 1);
            } else {
                resMap.put(s, count + 1);
            }
        }

        return resMap;
    }
}
