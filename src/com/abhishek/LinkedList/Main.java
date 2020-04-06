package com.abhishek.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(5);
        list.addLast(10);
        list.addLast(15);
        list.addLast(25);
        System.out.println(list.getKth(1));
        }
}
