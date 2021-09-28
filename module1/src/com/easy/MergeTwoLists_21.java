package com.easy;

import com.entity.ListNode;

/**
 * 输入：l1 = [1,2,4], l2 = [1,3,4]
 * 输出：[1,1,2,3,4,4]
 * 将两个升序链表合并为一个新的 升序 链表并返回
 * @author firstGrass
 * @create 2021-09-9:21 下午
 */
public class MergeTwoLists_21 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l12 = new ListNode(2);
        ListNode l13 = new ListNode(4);
        l1.next = l12;
        l12.next = l13;

        ListNode l2 = new ListNode(1);
        ListNode l22 = new ListNode(3);
        ListNode l23 = new ListNode(4);
        l2.next = l22;
        l22.next = l23;

//        while (l1 != null){
//            System.out.println("l1.getVal() = " + l1.getVal());
//            l1 = l1.next;
//        }
//        while (l2 != null){
//            System.out.println("l2.getVal() = " + l2.getVal());
//            l2 = l2.next;
//        }
        ListNode res = mergeTwoLists(l1, l2);
        while (res != null) {
            System.out.println("res.getVal() = " + res.getVal());
            res = res.next;
        }
    }

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode tem = res;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tem.next = l1;
                l1 = l1.next;
            }
            else {
                tem.next = l2;
                l2 = l2.next;
            }
            tem = tem.next;
        }
//        if (l1 == null && l2 != null) {
//            tem.next = l2;
//        }
//        if (l2 == null && l1 != null) {
//            tem.next = l1;
//        }
        // 合并为一句代码
        tem.next = l1 == null ? l2 : l1;
        return res.next;

    }

}
