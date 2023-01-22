// Time Complexity O(H)
// Space Complexity O(H)
// Recursive Approach
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null || root.val==val)return root;
        if(root.val>val) return searchBST(root.left,val);
        else return searchBST(root.right,val);
    }
}
// Time Complexity O(H)
// Space Complexity (1)
// Iterative Approach
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        // TreeNode result = null;
        while(root!=null){
          if(root.val==val) return root;
          else if(root.val>val) root=root.left;
          else root=root.right;
        }
        return null;
    }
}