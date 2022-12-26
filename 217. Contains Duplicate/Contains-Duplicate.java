// Time Complexity O(n)
// Space Complexity O(n)
class Solution {
    public boolean containsDuplicate(int[] nums) {
      Set<Integer> set = new HashSet<>();
      for(int i:nums){
        if(!set.add(i)) return true;
      }
      return false;
    }
}

// Time Complexity O(nlogn)
// Space Complecity O(1)
class Solution {
    Arrays.sort(nums);
    for(int i=0;i<nums.length-1;i++){
      if(nums[i]==nums[i+1])return true;
    }
    return false;
}
