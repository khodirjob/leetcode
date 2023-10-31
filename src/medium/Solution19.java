package medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution19 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode current = listNode;
        ListNode node = new ListNode(3);
        current.next = node;
        current = node;
        node = new ListNode(5);
        current.next = node;
        current = node;
        node = new ListNode(8);
        current.next = node;
        current = node;
        node = new ListNode(9);
        current.next = node;
        current = node;

        System.out.println(removeNthFromEnd(listNode, 1));

    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = head;
        for (int i = 0; i < n; i++)
            node = node.next;

        if (node == null)
            return head.next;

        ListNode slow = head;

        while (node.next != null) {
            slow = slow.next;
            node = node.next;
        }
        slow.next = slow.next.next;

        return head;
    }



    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
