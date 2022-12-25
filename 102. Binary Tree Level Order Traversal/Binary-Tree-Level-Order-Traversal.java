// Recursive Approach
// Time Complexity O(n)
// Space Complexity O(n)
class Solution {
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
       if(root==null) return list;
       else{
         bfs(root,0);
         return list;
       }
    }
    public void bfs(TreeNode node, int level){
      if(list.size()==level){
        list.add(new ArrayList<Integer>());
      }
      list.get(level).add(node.val);
      if(node.left!=null){
        bfs(node.left,level+1);
      }
      if(node.right!=null){
        bfs(node.right,level+1);
      }
    }
}
// Iterative Approach
// Time Complexity O(n)
// Space Complexity O(n)
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null) return list;
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> sublist = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node = queue.poll();
                sublist.add(node.val);
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);
            }
            list.add(sublist);
        }
        return list;
    }
}