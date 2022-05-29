package tasks.easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

    List<Integer> results = new ArrayList<>();

    public void solve(TreeNode root) {
        if (root == null) {
            return;
        }

        solve(root.left);
        results.add(root.val);
        solve(root.right);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        solve(root);
        return results;
    }

    static class TreeNode {

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
