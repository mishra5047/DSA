package com.abhishek.Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args){
//    ArrayQueue queue = new ArrayQueue(4);
//    queue.enque(10);
//    queue.enque(15);
//    queue.enque(20);
//    System.out.println(queue.deque());
//    System.out.println(queue);


    }


    public static void reverse(Queue<Integer> queue) {

        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty())
            stack.push(queue.remove());

        while (!stack.isEmpty())
            queue.add(stack.pop());
    }
}
