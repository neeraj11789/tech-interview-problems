package v2.linkedlist;

import v1.datastructures.ListNode;

import java.util.List;

public class AddNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode curr1 = l1;
        ListNode curr2 = l2;
        ListNode dummyNode = new ListNode(0);
        ListNode current = dummyNode;

        int digit1 = 0;
        int digit2 = 0;
        int sum = 0;
        int carry = 0;

        while (null!=curr1 || null!=curr2){
            digit1 = curr1 == null ? 0 : curr1.val;
            digit2 = curr2 == null ? 0 : curr2.val;

            sum = digit1 + digit2 + carry;
            if(sum > 9) {
                sum = sum % 10;
                carry = 1;
            }
            else
                carry = 0;

            current.next = new ListNode(sum);
            current = current.next;

            curr1 = curr1 == null ? null : curr1.next;
            curr2 = curr2 == null ? null : curr2.next;
        }

        // handle the edge case of last carry which leads to increase in digits
        if(carry == 1)
            current.next = new ListNode(carry);
        return dummyNode.next;
    }


    public void print(ListNode current){
        while (current != null){
            System.out.println(current.val + " ");
            // move ahead
            current = current.next;
        }
    }
}
