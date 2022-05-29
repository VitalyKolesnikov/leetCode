package tasks.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumDepthOfBinaryTreeTest {

    /**
     *     3
     *   /   \
     * 9      20
     *       /  \
     *     15    7
     */
    @Test
    void case1() {
        MaximumDepthOfBinaryTree.TreeNode root = new MaximumDepthOfBinaryTree.TreeNode(
                3,
                new MaximumDepthOfBinaryTree.TreeNode(9),
                new MaximumDepthOfBinaryTree.TreeNode(20,
                        new MaximumDepthOfBinaryTree.TreeNode(15),
                        new MaximumDepthOfBinaryTree.TreeNode(7)));

        var actual = new MaximumDepthOfBinaryTree().maxDepth(root);

        assertEquals(actual, 3);
    }

    @Test
    void case2() {
        MaximumDepthOfBinaryTree.TreeNode root = new MaximumDepthOfBinaryTree.TreeNode(
                1,
                null,
                new MaximumDepthOfBinaryTree.TreeNode(2));

        var actual = new MaximumDepthOfBinaryTree().maxDepth(root);

        assertEquals(actual, 2);
    }
}
