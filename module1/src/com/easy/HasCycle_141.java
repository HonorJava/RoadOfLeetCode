package com.easy;

import com.entity.ListNode;

/**
 * @author firstGrass
 * @create 2021-09-9:52 下午
 */
public class HasCycle_141 {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode head1 = new ListNode(2);
        ListNode head2 = new ListNode(0);
        ListNode head3 = new ListNode(-4);
        head.next = head1;
        head1.next = head2;
        head2.next = head3;
        head3.next = head1;
        System.out.println(hasCycle(head));
    }
    public static boolean hasCycle(ListNode head) {
//        1、快慢指针，让快指针先走一步，然后同时走，如果相遇即存在环
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null) {
            fast = fast.next;
            if (fast == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}
