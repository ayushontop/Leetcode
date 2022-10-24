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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>list = new ArrayList<>();
        post(list,root);
        return list;
        
    }
    public void post(List<Integer> list, TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        post(list,root.left);
        post(list,root.right);
        list.add(root.val);
    }
}