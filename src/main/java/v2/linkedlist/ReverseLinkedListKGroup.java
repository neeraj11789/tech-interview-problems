package v2.linkedlist;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import v1.datastructures.ListNode;

import java.util.ArrayList;
import java.util.List;

public class ReverseLinkedListKGroup {

    private ListNode head;

    private Integer group;

    public ReverseLinkedListKGroup(int k, ListNode head) {
        this.group = k;
        this.head = head;
    }

    public ListNode run(){
        if(head == null)
            return null;
        List<ListNode> headsForReversing = getHeads(head);
        List<Pair<ListNode, ListNode>> listOfPairs = new ArrayList<>();

        headsForReversing.forEach( l -> {
            listOfPairs.add(reverseList( l, group ));
        } );

        for (int i = 0; i < listOfPairs.size() - 1; i++) {
            Pair<ListNode, ListNode> currentPair = listOfPairs.get( i );
            Pair<ListNode, ListNode> nextPair = listOfPairs.get( i + 1 );

            currentPair.getRight().next = nextPair.getLeft(); // join the parts
        }

        ListNode newHead = listOfPairs.get( 0 ).getLeft();
        return newHead;
    }

    private List<ListNode> getHeads(ListNode head) {
        List<ListNode> result = new ArrayList<>();
        int counter = 0;
        ListNode current = head;

        while (current != null){
            if(counter % group == 0)
                result.add( current );
            current = current.next;
            counter++;
        }

        return result;
    }

    public Pair<ListNode, ListNode> reverseList(ListNode head, int k) {
        ListNode current = head;
        ListNode prev = null;
        ListNode next;
        int counter = 0;

        ListNode newHead;
        ListNode newTail = head;

        while (current != null && counter < k){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            counter++;
        }
        newHead = prev;

        Pair<ListNode, ListNode> nodePair = new ImmutablePair<>( newHead, newTail );
        return nodePair;
    }
}
