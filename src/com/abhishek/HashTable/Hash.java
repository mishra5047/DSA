package com.abhishek.HashTable;

import java.util.LinkedList;

public class Hash {
    LinkedList<Entry>[] list = new LinkedList[5];

    public void put(int key, String value){
        int index = hashFunction(key);

        if (list[index] == null)
            list[index] = new LinkedList<>();

        var bucket = list[index];

        for (var input : bucket){
      if (input.key == key) {
        input.value = value;

        return;
      }
            }

        bucket.addLast(new Entry(key, value));
    }

    private int hashFunction(int key){
        return key % list.length;
    }

    public String get(int key){

        var index = hashFunction(key);
        var bucket = list[index];

        if (bucket != null){
        for (var entry : bucket)
            if (entry.key == key)
                return entry.value;
        }
        return null;
        }
}
