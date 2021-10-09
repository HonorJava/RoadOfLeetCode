package com.easy;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author firstGrass
 * @create 2021-09-11:33 上午
 */
public class MinStack_155 {
    public static void main(String[] args) {

//        Your MinStack object will be instantiated and called as such:
        MinStack obj = new MinStack();
        obj.push(6);
        obj.push(4);
        obj.pop();
        int param_3 = obj.top();
        int param_4 = obj.getMin();
        System.out.println("param_4 = " + param_4);

    }
}
class MinStack {
    Deque<Integer> xStack;
    Deque<Integer> minStack;
    /** initialize your data structure here. */
    public MinStack() {
        xStack = new LinkedList<>();
//        xStack.push(3);
        minStack = new LinkedList<>();
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int val) {
        xStack.push(val);
        minStack.push(Math.min(minStack.peek(), val));
    }

    public void pop() {
        xStack.pop();
        minStack.pop();
    }

    public int top() {
        return xStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

