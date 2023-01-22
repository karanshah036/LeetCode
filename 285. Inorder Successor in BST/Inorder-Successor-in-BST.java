// Time complexity O(N) in worst case (Scewed Tree) O(log n) best case (Balanced tree)
// Space Complexity O(1)
class Solution {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        TreeNode successor=null;
        while(root!=null){
          if(p.val>=root.val) root=root.right;
          else{
            successor=root;
            root=root.left;
          }
        }
        return successor;
    }
}