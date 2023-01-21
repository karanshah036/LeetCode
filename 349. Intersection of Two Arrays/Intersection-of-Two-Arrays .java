// Time Complexity O(n+m)
// Space Complexity O(n+m)
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i:nums1)set1.add(i);
        for(int i:nums2)set2.add(i);
        int[] ans = new int[Math.min(set1.size(),set2.size())];
        int pointer=0;
        for(int i:set2){
          if(set1.contains(i)) ans[pointer++]=i;
        }
        return Arrays.copyOf(ans,pointer);
    }
}