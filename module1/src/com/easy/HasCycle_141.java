package com.easy;

import com.entity.ListNode;

import java.util.HashSet;

/**
 * @author firstGrass
 * @create 2021-09-9:52 下午
 */
public class HasCycle_141 {
    public static void main(String[] args) {
        ListNode head = new ListNode().init();
        System.out.println(hasCycle(head));
    }

    public static boolean hasCycle(ListNode head) {
//        1、快慢指针，让快指针先走一步，然后同时走，如果相遇即存在环
        /*
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
        */
        // 2、遍历节点add进hashSet，若返回false，则存在环
        HashSet<Object> hashSet = new HashSet<>();
        while (head != null) {
            if (!hashSet.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
        /*
        3、递归
        class HasCycleInLinkedList{
            public boolean hasCycle(ListNode head){
               if(head == null || head.next == null) return false;
               if(head.next == head) return true;
               ListNode nextNode = head.next;
               head.next = head;
               boolean isCycle = hasCycle(nextNode);
               return isCycle;
            }
        }
         */
    }
}
