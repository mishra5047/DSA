package com.abhishek.Stack;

import java.nio.file.LinkPermission;
import java.util.Stack;

public class Reverse {

    public String reverse(String str){
        Stack<Character> stack = new Stack<>();

        if (str.equals("null"))
            throw new IllegalArgumentException();

        for (char ch : str.toCharArray())
            stack.push(ch);

        StringBuffer buffer = new StringBuffer();

        while (!stack.empty())
            buffer.append(stack.pop());

        return buffer.toString();
    }

}
