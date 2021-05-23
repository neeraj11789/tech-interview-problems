package v2.linkedlist;

import v1.datastructures.ListNode;

public class IntersectionOfLinkedList {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        final int lengthA = length(headA);
        final int lengthB = length(headB);
        ListNode shorter = headA;
        ListNode lengthier = headB;
        ListNode answer = null;

        int extraSteps = lengthB - lengthA;
        if(lengthA > lengthB){
            extraSteps = lengthA - lengthB;
            shorter = headB;
            lengthier = headA;
        }

        for (int i = 0; i < extraSteps; i++) {
            lengthier = lengthier.next;
        }

        while (shorter != null && lengthier != null){
            if(shorter.val == lengthier.val){
                answer = shorter;
                break;
            }
            shorter = shorter.next;
            lengthier = lengthier.next;
        }
        return answer;
    }

    private int length(final ListNode headA) {
        ListNode current = headA;
        int length=0;
        while (current !=null){
            current = current.next;
            length++;
        }
        return length;
    }

    public void print(ListNode current){
        while (current != null){
            System.out.println(current.val + " ");
            // move ahead
            current = current.next;
        }
    }
}