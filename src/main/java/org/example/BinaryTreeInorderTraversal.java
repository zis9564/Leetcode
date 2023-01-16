package org.example;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

    List<Integer> result = new ArrayList<>();

    public void inorderTraversal(TreeNode root) {
        printInorder(root);
        System.out.println(result);
    }

    void printInorder(TreeNode node) {
        if (node == null)
            return;
        printInorder(node.left);
        result.add(node.val);
        printInorder(node.right);
    }
}
