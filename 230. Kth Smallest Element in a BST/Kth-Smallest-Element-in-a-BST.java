// Time Complexity O(n)
// Space complecity O(n)
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        TreeSet<Integer> set = new TreeSet<>();
        dfs(root,set);
        Iterator it = set.iterator();
        for(int i=1;i<k;i++){
            set.pollFirst();
        }
        int ans = set.pollFirst();
        return ans;
    }
    public SortedSet dfs(TreeNode root, SortedSet set){
        if(root==null) return set;
        dfs(root.left,set);
        set.add(root.val);
        dfs(root.right,set);
        return set;
    }
}
// Time Complexity O(n)
// Space Complexity O(H)
class Solution {
  public int kthSmallest(TreeNode root, int k) {
    LinkedList<TreeNode> stack = new LinkedList<>();

    while (true) {
      while (root != null) {
        stack.push(root);
        root = root.left;
      }
      root = stack.pop();
      if (--k == 0) return root.val;
      root = root.right;
    }
  }
}