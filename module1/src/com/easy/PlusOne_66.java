package com.easy;

import javax.lang.model.SourceVersion;
import java.util.Arrays;

/**
 * 输入：digits = [1,2,3]
 * 输出：[1,2,4]
 * 解释：输入数组表示数字 123。
 * @author firstGrass
 * @create 2021-09-11:17 上午
 */
public class PlusOne_66 {
    public static void main(String[] args) {
        int[] digits = {9, 9, 9};
        int[] res = plusOne(digits);
        System.out.println("Arrays.toString(res = " + Arrays.toString(res));
    }

    private static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >=0 ; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        digits = new int [digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}
