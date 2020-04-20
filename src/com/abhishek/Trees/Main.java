package com.abhishek.Trees;

public class Main {
    public static void main(String[] args){
        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        System.out.println(tree.find(4));

    }
}
