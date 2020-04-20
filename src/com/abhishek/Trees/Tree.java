package com.abhishek.Trees;

public class Tree {

  private class Node {
    int value;
    private Node right;
    private Node left;

    public Node(int val) {
        this.value = val; }

    @Override
    public String toString(){
        return "Node= " + value;
    }
  }

  private Node root;

  public void insert(int val){
      var node = new Node(val);

      if (root == null){
          root = node;
        return;
        }

      var current = root;
      while (true) {
          if (val < current.value) {
              if (current.left == null) {
                  current.left = node;
                  break;
              }
              current = current.left;
          }
          else {
              if (current.right == null) {
                  current.right = node;
                  break;
              }
              current = current.right;
          }
      }
  }

public boolean find(int item){
  var current = root;
      while (current != null){
       if (item < current.value) current = current.left;

      else if (item > current.value) current = current.right;

      else return true;
      }
    return false;
  }


}

