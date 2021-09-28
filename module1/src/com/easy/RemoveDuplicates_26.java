package com.easy;

import java.util.Arrays;

/**
 * 输入：nums = [0,0,1,1,1,2,2,3,3,4]
 * 输出：5, nums = [0,1,2,3,4]
 * 解释：函数应该返回新的长度 5 ， 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4 。不需要考虑数组中超出新长度后面的元素。
 * @author firstGrass
 * @create 2021-09-11:29 下午
 */
public class RemoveDuplicates_26 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int res = removeDuplicates(nums);
        System.out.println("res = " + res);
    }

    private static int removeDuplicates(int[] nums) {
        int mark = 1;
        for (int i = 0; i < nums.length - 1; i++)
            if (nums[i + 1] != nums[i])
                nums[mark++] = nums[i + 1];
        return mark;
    }
}
