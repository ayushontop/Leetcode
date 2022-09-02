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
    public List<Double> averageOfLevels(TreeNode root) {
         List<Double> result = new ArrayList<>();
    Queue<TreeNode> ayushhh = new LinkedList<>();
    
    if(root == null) return result;
    ayushhh.add(root);
    while(!ayushhh.isEmpty()) {
        int n = ayushhh.size();
        double sum = 0.0;
        for(int i = 0; i < n; i++) {
            TreeNode node = ayushhh.poll();
            sum += node.val;
            if(node.left != null) ayushhh.offer(node.left);
            if(node.right != null) ayushhh.offer(node.right);
        }
        result.add(sum / n);
    }
    return result;
}
}