package com.abhishek.Array;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Array array = new Array(10);
        array.insert(4);
        array.insert(2);
        array.insert(1);
        array.insert(5);
        array.insert(1);
        array.insert(7);
        System.out.println(Arrays.toString(array.rev()));
    }
}
