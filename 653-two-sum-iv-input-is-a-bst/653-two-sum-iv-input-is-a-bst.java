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
    // public boolean findTarget(TreeNode root, int k) {
         HashSet<Integer> hs = new HashSet<>();
        public boolean findTarget(TreeNode root, int k) {
        if (root==null) 
            return false;
        if (hs.contains(root.val)) 
            return true;
        hs.add(k-root.val);
        return findTarget(root.right, k) || findTarget(root.left, k);
    }
}
       