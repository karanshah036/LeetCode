// Time Complexity O(n)
// Space Complexity O(n)
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null) return list;
        queue.offer(root);
        while(!queue.isEmpty()){
          int size= queue.size();
          List<Integer> sublist = new ArrayList<>();
          for(int i=0;i<size;i++){
            TreeNode node = queue.poll();
            sublist.add(node.val);
            if(node.left!=null) queue.offer(node.left);
            if(node.right!=null) queue.offer(node.right);
          }
          list.add(sublist);
        }
        for(int i=0;i<list.size();i++){
          if(i%2!=0)Collections.reverse(list.get(i));
        }
        return list;
    }
}