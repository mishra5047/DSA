package com.abhishek.HashTable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CharFinder {
    public char findFirstNonRepeatingChar(String str){
        Map<Character, Integer> map = new HashMap<>();
                char[] varch = str.toCharArray();
                int count;

                for (var ch : varch){
            count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count +1); }

    for (var ch : varch) {
        count = map.get(ch);
        if (map.get(ch) == 1) return ch;
    }

            return Character.MIN_VALUE;
    }

    public char findFirstRepeatingChar(String str){
        Set<Character> set = new HashSet<>();

        for (var cha : str.toCharArray()){
            if (set.contains(cha)) return cha;
            set.add(cha);
            }
        return Character.MIN_VALUE;
    }}
