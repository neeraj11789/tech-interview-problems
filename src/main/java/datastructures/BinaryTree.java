package datastructures;

import datastructures.BTNode;
import lombok.Getter;
import lombok.Setter;

import javax.swing.tree.TreeNode;
import java.util.*;

public class BinaryTree {

    @Getter @Setter
    public BTNode root = null;

    public BinaryTree(BTNode root) {
        this.root = root;
    }

    public BinaryTree() {
    }

    public void inorder() {
        Stack<BTNode> stack = new Stack<>();

        BTNode current = root;

        while (current != null || !stack.empty()){

            // Push all left in the stack
            while (current!= null && current.left != null){
                stack.push(current);
                current = current.left;
            }

            // when current is null - pop from stack and process
            current = stack.pop();
            System.out.println(current.data);

            current = current.right;
        }
    }

    public List<List<Integer>> levelOrder(BTNode root) {
        if(root == null)
            return null;

        List<List<Integer>> res = new ArrayList<>();
        Queue<BTNode> queue = new LinkedList<>();

        BTNode current = root;
        queue.offer(current);

        while (!queue.isEmpty()){
            List<Integer> sublist = new ArrayList<>();
            for (int i = 0; i < queue.size(); i++) {

            current = queue.poll();
            sublist.add(current.data);
            if(current.left != null)
                queue.add(current.left);
            if(current.right != null)
                queue.add(current.right);
            }
            res.add(sublist);

            Stack<Integer> stack = new Stack<>();
            while (!stack.isEmpty()){
                stack.peek();
            }
            List<List<Integer>> resu = new ArrayList<>();
            Collections.reverse(resu);
        }
        return res;
    }
}
