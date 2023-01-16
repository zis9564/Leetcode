package org.leetcode.easy;

import org.leetcode.util.TreeNode;

public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        return checkSymmetry(root.left, root.right);
    }

    private boolean checkSymmetry(TreeNode left, TreeNode right) {
        if(left == null && right == null)
            return true;
        if(left == null || right == null)
            return false;
        if(left.val == right.val) {
            return checkSymmetry(left.left, right.right) && checkSymmetry(left.right, right.left);
        }
        return false;
    }
}
