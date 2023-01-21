// Time complexity O(N)
// Space Complexity O(w)
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root==null) return list;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            int max=Integer.MIN_VALUE;
            for(int i=0;i<size;i++){
                TreeNode front = queue.poll();
                max = Math.max(max,front.val);
                if(front.left!=null) queue.offer(front.left);
                if(front.right!=null) queue.offer(front.right);
            }
            list.add(max);
        }
        return list;
    }
}