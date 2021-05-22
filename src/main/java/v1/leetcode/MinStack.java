package v1.leetcode;

import java.util.Stack;

/***
 * https://leetcode.com/problems/min-stack/
 */
class MinStack {

    private Stack<Node> stack;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int x) {
        int min;
        if(!stack.empty()){
            Node top = stack.peek();
            min = top.min;
            if(x < min)
                min = x;
            Node n = new Node(x, min);
            stack.push(n);
        }else{
            Node n = new Node(x, x);
            stack.push(n);
        }
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        Node top = stack.peek();
        return top.data;
    }

    public int getMin() {
        Node top = stack.peek();
        return top.min;
    }

    /**
     * Inner Class
     **/
    public class Node{
        int data;
        int min;

        public Node(int a, int b){
            this.data = a;
            this.min=b;
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */