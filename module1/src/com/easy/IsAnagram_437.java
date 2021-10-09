package com.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * @author firstGrass
 * @create 2021-10-9:24 上午
 */
public class IsAnagram_437 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean res = isAnagram(s, t);
        System.out.println("res = " + res);
    }

    private static boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        if (s.length() != t.length()) return false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            map.put(c, map.getOrDefault(c, 0) - 1);
            if (map.get(c) < 0) {
                return false;
            }
        }
        return true;
    }
}
