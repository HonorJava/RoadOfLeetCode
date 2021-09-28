package com.medium;

import java.util.Arrays;

/**
 * 输入: nums = [1,2,3,4,5,6,7], k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 * @author firstGrass
 * @create 2021-09-9:07 上午
 */
public class Rotate_189 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(nums, k);
        System.out.println("nums = " + Arrays.toString(nums));
    }

    private static void rotate(int[] nums, int k) {
        // 超时
        /*
        if (k <= 0) {
            return;
        }
        int tem = nums[nums.length - 1];
        for (int i = 0; i < nums.length; i++) {
            int temp2 = nums[i];
            nums[i] = tem;
            tem = temp2;
        }
        rotate(nums, --k);
        */
        // 超时
        /*
        for (int j = 0; j < k; j++) {
            int tem = nums[nums.length - 1];
            for (int i = 0; i < nums.length; i++) {
                int temp2 = nums[i];
                nums[i] = tem;
                tem = temp2;
            }
        }
        */
        // 数组反转
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
}
