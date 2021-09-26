package com.easy;

import com.entity.ListNode;

/**
 * @author firstGrass
 * @create 2021-09-10:14 上午
 */
public class ReverseList_206 {
    public static void main(String[] args) {
        ListNode head = new ListNode().init();
//        while (head != null) {
//            System.out.println("res.getVal() = " + head.getVal());
//            head = head.next;
//        }
        ListNode res = reverseList(head);
//        System.out.println("res.getVal() = " + res.getVal());
        while (res != null) {
            System.out.println("res.getVal() = " + res.getVal());
            res = res.next;
        }
    }

    private static ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = newHead;
            newHead = head;
            head = temp;
        }
        return newHead;
    }

}
