package com.abhishek.HashTable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args){

        Map<String, String> map = new HashMap<>();
        map.put("123456-a", "abc");
        System.out.println(hashValue("9584454-A"));
    }

    // 100 is the number of employees

    public static int hashValue(String str){
        int a = 0;
        for (var c : str.toCharArray())
            a += c;
        return a % 100;

    }



}
