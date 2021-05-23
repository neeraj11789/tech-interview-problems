package v2.linkedlist;

import v1.datastructures.ListNode;

public class RemoveNodeWithValue {

    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = head;
        ListNode current = head;
        ListNode next = null;

        if(head.val == val){
            current = current.next;
            head = current;
        }

        while (current != null){
            if(current.val == val){
                prev.next = current.next;
            }

            next = current.next;
            prev = current;
            current = next;
        }
        return head;
    }


    public void print(ListNode current){
        while (current != null){
            System.out.println(current.val + " ");
            // move ahead
            current = current.next;
        }
    }
}
