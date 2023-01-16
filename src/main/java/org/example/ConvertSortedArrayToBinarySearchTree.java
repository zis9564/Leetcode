package org.example;

public class ConvertSortedArrayToBinarySearchTree {

    public TreeNode createBalancedTree(int[] arr) {
        return createBalancedTree(arr, 0, arr.length - 1);
    }

    public TreeNode createBalancedTree(int[] arr, int start, int end) {
        if (end < start) {
            return null;
        }
        int mid = (int) Math.floor((start + end) / 2);
        TreeNode node = new TreeNode(arr[mid]);

        node.left = createBalancedTree(arr, start, mid - 1);
        node.right = createBalancedTree(arr, mid + 1, end);

        return node;
    }
}
