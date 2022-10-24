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
    int maxi=0;
    public int diameterOfBinaryTree(TreeNode root) 
    {
        hg(root);
        return maxi;
        
        
    }
    public int hg(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int lh= hg(root.left);
        int rh= hg(root.right);
        maxi= Math.max(maxi,rh+lh);
        return 1+(Math.max(rh,lh));
        
    }
}