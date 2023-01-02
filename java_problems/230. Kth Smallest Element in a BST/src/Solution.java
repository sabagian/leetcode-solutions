import java.util.ArrayList;
import java.util.List;


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
    List<Integer> list= new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        allValues(root);
        list.sort((x, y)->Integer.compare(x, y));
        return list.get(k-1);
    }
    private void allValues(TreeNode root){
        if(root.left==null && root.right==null){
            list.add(root.val);
            return; 
        }else if(root.left==null && root.right!=null){
            list.add(root.val);
            allValues(root.right);
            return;
        }else if(root.left!=null && root.right==null){
            list.add(root.val); 
            allValues(root.left);
            return;
        }else{
            list.add(root.val); 
            allValues(root.left);
            allValues(root.right);
            return;
        }
    }
 
}