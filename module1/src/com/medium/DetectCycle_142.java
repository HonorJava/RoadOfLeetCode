package com.medium;

import com.entity.ListNode;

/**
 * @author firstGrass
 * @create 2021-09-11:44 上午
 */
public class DetectCycle_142 {
    public static void main(String[] args) {
//        ListNode head = new ListNode().init();
        ListNode head = new ListNode(1);
        head.next = null;
        System.out.println(detectCycle(head).getVal());
    }
    public static ListNode detectCycle(ListNode head) {
        ListNode tortoise = head;
        ListNode hare = head;
        ListNode meet = null;
        while (hare != null && hare.next != null) {
            hare = hare.next;
            if (hare.next == null) {
                return null;
            }
            tortoise = tortoise.next;
            hare = hare.next;
            if (tortoise == hare) {
                meet = tortoise;
                break;
            }
        }
        while (meet != null) {
            if (head == meet) {
                return head;
            }
            head = head.next;
            meet = meet.next;
        }
        return null;
    }
}
