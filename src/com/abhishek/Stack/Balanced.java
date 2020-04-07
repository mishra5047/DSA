package com.abhishek.Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Balanced {
    List<Character> leftBracket = Arrays.asList('(', '[','{','<');
    List<Character> rightBracket= Arrays.asList(')', ']','}','>');


    public boolean isBalanced(String input){
        if (input == null)
            throw new IllegalArgumentException();

        Stack<Character> stack = new Stack<>();

        //iterating over array
        for (char ch : input.toCharArray()){
            if (isLeftBracket(ch))
                stack.push(ch);

            if (isRightBracket(ch))
                if (stack.isEmpty()) return false;
                var top = stack.pop();

             if(!isEqual(top, ch))  return false;

        }
    return stack.empty();
    }

    private boolean isLeftBracket(char ch){
        return leftBracket.contains(ch);

    }

    private boolean isRightBracket(char ch){
        return rightBracket.contains(ch);
    }

    private boolean isEqual(char left,char right){
        return leftBracket.indexOf(left) == rightBracket.indexOf(right) ;

    }
}
