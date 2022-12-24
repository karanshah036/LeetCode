// Recursive Approach
// Time Complexity O(n)
// Space Complexity O(h)
class Solution {
    List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null) return list;
        else{
            inorderTraversal(root.left);
            list.add(root.val);
            inorderTraversal(root.right);
            return list;
        }
     }
}

// Iterative Approach
// Time Complexity O(n)
// Space Complexity O(h)
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        if(root==null) return list;
        TreeNode node = root;
        while(!stack.isEmpty() || node!=null){
            if(node!=null){
                stack.push(node);
                node=node.left;
            }else{
                node = stack.pop();
                list.add(node.val);
                node=node.right;
            }
        }
        return list;
    }
}