package medium;

import java.util.*;

public class Solution515 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(12);
        list.add(13);
        list.add(121);
        System.out.println(list.toString());
        System.out.println(list.poll());
        System.out.println(list.toString());
    }

    public List<Integer> largestValuess(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null)
            return list;
        LinkedList<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        while (!nodes.isEmpty()) {
            int max = Integer.MIN_VALUE;
            int size = nodes.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = nodes.poll();
                max = Math.max(max, poll.val);
                if (poll.left != null)
                    nodes.add(poll.left);
                if (poll.right != null)
                    nodes.add(poll.right);
            }
            list.add(max);
        }
        return list;
    }


    public List<Integer> largestValues(TreeNode root) {
        if (root == null)
            return null;
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        LinkedList<TreeNode> nodeList = new LinkedList<>();
        nodeList.add(root);
        queue.add(root);
        while (!queue.isEmpty()) {
            int max = Integer.MIN_VALUE;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                max = Math.max(node.val, max);
                if (node.right != null) {
                    queue.add(node.right);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
            }
            list.add(max);
        }
        return list;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
