package com.entity;

/**
 * Definition for singly-linked list.
 * @author firstGrass
 * @create 2021-09-9:57 下午
 */
public class ListNode {
    private int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int x) {
        val = x;
        next = null;
    }
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
    public ListNode init() {
        ListNode head = new ListNode(1);
        ListNode head1 = new ListNode(2);
        ListNode head2 = new ListNode(3);
        ListNode head3 = new ListNode(4);
        head.next = head1;
        head1.next = head2;
        head2.next = head3;
        head3.next = null;
//        head3.next = head1;
        return head;
    }
}
