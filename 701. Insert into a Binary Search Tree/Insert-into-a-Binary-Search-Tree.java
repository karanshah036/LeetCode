// Time Complexity O(H)
// Space Complexity O(H)
// Recursive Appraoch
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) return new TreeNode(val);
        else if(root.val<val) root.right=insertIntoBST(root.right,val);
        else{
            root.left=insertIntoBST(root.left,val);
        }
        return root;
    }
}
// Time complexity O(H)
// Space Complexity O(1)
// Iterative Approach
public TreeNode insertIntoBST(TreeNode root, int val) {
    TreeNode node = root;
    while (node != null) {
      if (val > node.val) {
        // insert right now
        if (node.right == null) {
          node.right = new TreeNode(val);
          return root;
        }
        else node = node.right;
      }
      else {
        if (node.left == null) {
          node.left = new TreeNode(val);
          return root;
        }
        else node = node.left;
      }
    }
    return new TreeNode(val);
  }