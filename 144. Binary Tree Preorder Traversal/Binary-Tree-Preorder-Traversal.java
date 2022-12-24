// Recursive Approach
// Time complexity O(n)
// Space complexity O(n)
class Solution {
	List<Integer> list = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null) return list;
        else{
        	list.add(root.val);
        	preorderTraversal(root.left);
        	preorderTraversal(root.right);
        }
        return list;
    }
}

// Iterative Approach 
// Time complexity O(n)
// Space complexity O(n)
class Solution {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root==null) return list;
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode top = stack.pop();
            list.add(top.val);
            if(top.right!=null) stack.push(top.right);
            if(top.left!=null) stack.push(top.left); 
        }
        return list;
    }
}