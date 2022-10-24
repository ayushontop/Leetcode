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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res= new LinkedList<>();
        if(root==null) return res;
        Queue <TreeNode> q= new LinkedList<>();
        boolean flag=true;
        TreeNode node=root;
        q.add(node);
        do{
            int size=q.size();
            List<Integer> list =new LinkedList<>();
            Stack <Integer> stk= new Stack<>();
            for(int i=0; i<size; i++){
                node= q.poll();
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
                if(flag) list.add(node.val);
                else stk.push(node.val);
            }
            while(!stk.isEmpty()) list.add(stk.pop());
            res.add(list);
            flag=!flag;
        }
        while(!q.isEmpty());
        return res;
    }
}