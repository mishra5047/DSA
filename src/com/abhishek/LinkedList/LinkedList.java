package com.abhishek.LinkedList;

import java.util.NoSuchElementException;

public class LinkedList {
    private int count = 0;

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

    }

    private Node first;
    private Node last;

    public void addLast(int item) {
        var node = new Node(item);

        if (first == null)
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
        count++;
    }

    public void addFirst(int item) {

        var node = new Node(item);

        if (isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
        count++;
    }

    public void removeLast() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last)
            first = last = null;

        var previous = getPrevious(last);
        last = previous;
        last.next = null;

        count--;
    }

    private Node getPrevious(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    public int indexof(int item) {
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {
        var current = first;
        while (current != null) {
            if (current.value == item) return true;
            current = current.next;
        }
        return false;
    }

    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
        }
        var second = first.next;
        first.next = null;
        first = second;

        count--;
    }

    private boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return count;
    }

    public int[] toArray() {
        int[] array = new int[count];
        var current = first;
        var index = 0;
        while (current != null) {
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    public void reverse() {
        if (isEmpty()) return;

        var c = first.next;
        var p = first;
        while (c != null){
            var next = c.next;
            c.next = p;
            p = c;
            c = next;
        }

        last = first;
        last.next = null;
        first = p;
        }

    public int getKth(int k){
        var a = first;
        var b = first;
        for (int i = 0; i < k - 1; i++)
            b = b.next;
        while(b.next != null){
            a = a.next;
            b = b.next;
        }
        return a.value;
    }
}