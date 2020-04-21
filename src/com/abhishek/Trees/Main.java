package com.abhishek.Trees;

public class Main {
    public static void main(String[] args){
        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(8);
        tree.insert(10);
        tree.insert(78);
        tree.insert(14);
        tree.insert(2);

        System.out.println(tree.min());

    }
}
