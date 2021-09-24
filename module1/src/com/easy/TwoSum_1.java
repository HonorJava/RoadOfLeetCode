package com.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1.两数之和
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * @author firstGrass
 * @create 2021-09-11:32 上午
 */
public class TwoSum_1 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[] {map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
