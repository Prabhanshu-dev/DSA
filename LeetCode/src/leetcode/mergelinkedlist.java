package leetcode;
public class mergelinkedlist {

    public static Node mergeTwoSortedLinkedLists(Node head1, Node head2) {
        if (head1 == null) {
            return head2;
        }

        if (head2 == null) {
            return head1;
        }

        if (head1.data < head2.data) {
            head1.next = mergeTwoSortedLinkedLists(head1.next, head2);
            return head1;
        } else {
            head2.next = mergeTwoSortedLinkedLists(head1, head2.next);
            return head2;
        }
    }

    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(4);

        Node head2 = new Node(1);
        head2.next = new Node(3);
        head2.next.next = new Node(4);

        Node mergedHead = mergeTwoSortedLinkedLists(head1, head2);

        while (mergedHead != null) {
            System.out.print(mergedHead.data + " ");
            mergedHead = mergedHead.next;
        }
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}