package v2.linkedlist;

public class DeleteNode {

    private ListNode head = null;

    public DeleteNode() {
        final ListNode listNode1 = new ListNode(1);
        final ListNode listNode2 = new ListNode(2);
        final ListNode listNode3 = new ListNode(3);
        final ListNode listNode4 = new ListNode(4);
        final ListNode listNode5 = new ListNode(5);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = null;

        head = listNode1;
    }

    public void deleteNode(final Integer number){
        ListNode current = head;
        ListNode prev = current;

        if(head == null)
            throw new IllegalArgumentException("list is empty");
        // first element
        if(number == head.data){
            head = current.next;
            return;
        }

        while (current != null){
            if(number.equals(current.data)){
                prev.next = current.next;
                break;
            }

            // move ahead
            prev = current;
            current = current.next;
        }
    }

    public void print(){
        ListNode current = head;
        while (current != null){

            System.out.println(current.data + " ");

            // move ahead
            current = current.next;
        }
    }

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }
}
