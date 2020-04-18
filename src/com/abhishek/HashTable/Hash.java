package com.abhishek.HashTable;

import java.util.LinkedList;

public class Hash {
    LinkedList<Entry>[] list = new LinkedList[5];

    public void put(int key, String value){

        var entry = getEntry(key);
        if (entry != null){
            entry.value = value;
            return;
        }

        getOrCreateBucket(key).add(new Entry(key, value));
    }

    private LinkedList<Entry> getOrCreateBucket(int key){
        var index = hashFunction(key);
        var bucket = list[index];
        if (bucket == null)
            list[index] = new LinkedList<>();

        return bucket;
    }
    private int hashFunction(int key){
        return key % list.length;
    }

  public String get(int key) {
    var entry = getEntry(key);
    var bucket = getBucket(key);

    return (entry == null) ? null : entry.value;

        }

     public void remove(int key){

        var entry = getEntry(key);
        if (entry == null) throw new IllegalStateException();
        getBucket(key).remove(entry);

     }

    private LinkedList<Entry> getBucket(int key) {
        return list[hashFunction(key)];
    }

    private Entry getEntry(int k){
        var bucket = getBucket(k);
        if (bucket != null){

      for (var i : bucket) {
        if (i.key == k) return i;
        }
    }
    return null;
    }
}
