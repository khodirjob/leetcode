package medium;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public static void main(String[] args) {

    }

    public ListNode addTwoNumber(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode currentNode = listNode;
        int number = 0;
        while (l1 != null || l2 != null) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += number;
            number = sum / 10;

            ListNode node = new ListNode(sum % 10);
            currentNode.next = node;
            currentNode = node;
        }

        return listNode.next;
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int number = 0;

        List<ListNode> nodeList = new ArrayList<>();
        ListNode listNode1 = l1;
        ListNode listNode2 = l2;
        while (listNode1 != null && listNode2 != null) {
            int val = listNode1.val + listNode2.val + number;
            ListNode listNode = new ListNode(val % 10);
            number = val / 10;
            nodeList.add(listNode);
            listNode1 = listNode1.next;
            listNode2 = listNode2.next;
        }
        while (listNode1 != null) {
            int val = listNode1.val + number;
            ListNode listNode = new ListNode(val % 10);
            number = val / 10;
            nodeList.add(listNode);
            listNode1 = listNode1.next;

        }

        while (listNode2 != null) {
            int val = listNode2.val + number;
            ListNode listNode = new ListNode(val % 10);
            number = val / 10;
            nodeList.add(listNode);
            listNode2 = listNode2.next;

        }
        if (number != 0) {
            ListNode node = new ListNode(number);
            nodeList.add(node);
        }
        for (int i = 0; i < nodeList.size() - 1; i++) {
            ListNode node = nodeList.get(i);
            node.next = nodeList.get(i + 1);
        }
        return nodeList.get(0);
    }

    class ListNode {
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