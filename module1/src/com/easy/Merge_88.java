package com.easy;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * 输出：[1,2,2,3,5,6]
 * 解释：需要合并 [1,2,3] 和 [2,5,6] 。
 * 合并结果是 [1,2,2,3,5,6] ，其中斜体加粗标注的为 nums1 中的元素。
 * @author firstGrass
 * @create 2021-09-10:48 下午
 */
public class Merge_88 {
    public static void main(String[] args) {
//        int[] nums1 = {1,2,3,0,0,0};
//        int[] nums2 = {2, 5, 6};
//        int m = 3;
//        int n = 3;
        int[] nums1 = {0};
        int[] nums2 = {1};
        int m = 0;
        int n = 1;
        merge(nums1, m, nums2, n);
        System.out.println("Arrays.toString(nums1) = " + Arrays.toString(nums1));
    }
    // 方法3 逆向双指针
    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m + n - 1;
        int p = m - 1;
        int q = n - 1;
        while (p >= 0 && q >= 0) {
            if (nums1[p] <= nums2[q]) {
                nums1[i--] = nums2[q--];
            } else {
                nums1[i--] = nums1[p--];
            }
        }
        // 如果还有剩余,不需要下面判断p
//        while (p >= 0) {
////            nums1[i--] = nums1[p--];
////        }
        while (q >= 0) {
            nums1[i--] = nums2[q--];
        }
    }
    // 方法2 开辟一新数组
    /*
    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[m + n];
        int i = 0;
        int j = 0;
        int curr = 0;
        while (i < m || j < n) {
            if (i == m) {
                curr = nums2[j++];
            } else if (j == n) {
                curr = nums1[i++];
            } else if (nums1[i] <= nums2[j]) {
                curr = nums1[i++];
            } else {
                curr = nums2[j++];
            }

            res[i + j - 1] = curr;
        }
        for (int k = 0; k < res.length; k++) {
            nums1[k] = res[k];
        }

    }
    */
    // 方法1 借用ArrayList
//    private static void merge(int[] nums1, int m, int[] nums2, int n) {
//        ArrayList<Integer> res = new ArrayList<>();
//        // get add方法降低性能
//        int i = 0;
//        int j = 0;
//        while (i < m && j < n) {
//            if (nums1[i] <= nums2[j]) {
//                res.add(nums1[i]);
//                i++;
//            }
//            else {
//                res.add(nums2[j]);
//                j++;
//            }
//        }
//        while (i < m)
//            res.add(nums1[i++]);
//        while (j < n)
//            res.add(nums2[j++]);
//        for (int k = 0; k < res.size(); k++) {
//            nums1[k] = res.get(k);
//        }
//    }

}
