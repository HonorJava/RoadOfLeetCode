package com.easy;

import java.util.*;

/**
 * 输入：s = "()[]{}"
 * 输出：true
 * @author firstGrass
 * @create 2021-09-12:01 上午
 */
public class IsValid_20 {
    public static void main(String[] args) {
        String s = "]";
        boolean res = isValid(s);
        System.out.println("res = " + res);
    }

    private static boolean isValid(String s) {
        if (s.length() < 2) {
            return false;
        }
        LinkedList<Character> stack = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.addFirst(')');
            } else if (c == '[') {
                stack.addFirst(']');
            } else if (c == '{') {
                stack.addFirst('}');
            } else if (stack.isEmpty() || c != stack.removeFirst()) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
