// Recursive Approach 
// Time complexity O(n)
// Space Complexity O(h)
class Solution {
    List<Integer> list = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
         if(root==null) return list;
         else{
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            list.add(root.val);
         }
        return list;  
    }
}

// Iterative Approach using 2 Stacks
// Time complexity O(n)
// Space Complexity O(h)
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
         List<Integer> list = new ArrayList<>();
         Stack<TreeNode> stack1 = new Stack<>();
         Stack<Integer> stack2 = new Stack<>();
         if(root==null) return list;
         stack1.push(root);
         while(!stack1.isEmpty()){
             TreeNode node = stack1.pop();
             stack2.push(node.val);
             if(node.left!=null)stack1.push(node.left);
             if(node.right!=null)stack1.push(node.right);
         }
         while(!stack2.isEmpty()){
             System.out.println(stack2.peek());
             list.add(stack2.pop());
         }
         return list;
    }
}

// Iterative Approach using 1 stack
// Approach 1
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
         List<Integer> list = new ArrayList<>();
         Stack<TreeNode> stack1 = new Stack<>();
         Stack<Integer> stack2 = new Stack<>();
         if(root==null) return list;
         stack1.push(root);
         while(!stack1.isEmpty()){
             TreeNode node = stack1.pop();
             list.add(node.val);
             if(node.left!=null)stack1.push(node.left);
             if(node.right!=null)stack1.push(node.right);
         }
        Collections.reverse(list);
        return list;
    }
}

//Approach 2
class Solution {
   
    public List<Integer> postorderTraversal(TreeNode root) {
         List<Integer> list = new ArrayList<>();
         Stack<TreeNode> stack = new Stack<>();
         if(root==null) return list;
         TreeNode curr = root;
         while(!stack.isEmpty() || curr!=null){
             if(curr!=null){
                 stack.push(curr);
                 curr=curr.left;
             }else{
                 TreeNode temp = stack.peek().right;
                 if(temp==null){
                     temp=stack.pop();
                     list.add(temp.val);
                     while(!stack.isEmpty() && stack.peek().right==temp){
                         temp=stack.pop();
                         list.add(temp.val);
                     }

                 }else{
                     curr=temp;
                 }
             }
         }
        return list;
    }
}