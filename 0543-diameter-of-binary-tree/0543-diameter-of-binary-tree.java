/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {

        hight(root);
        return max;
        
    }

    private int hight(TreeNode node){
        
        if(node == null){
            return 0;
        }

        int left = hight(node.left);
        int right = hight(node.right);

        max = Math.max(max,left+right);

        return 1 + Math.max(left,right);
    }
}