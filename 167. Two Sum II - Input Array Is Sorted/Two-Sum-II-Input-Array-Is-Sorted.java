// Time Complexity O(n)
// Space Complexity O(1)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        int left=0,right=nums.length-1;
        while(left<right){
            if(nums[left]+nums[right]==target){
                ans[0]=left+1;
                ans[1]=right+1;
                return ans;
            }else if(nums[left]+nums[right]<target) left++;
            else right--;
        }
        return ans;
    }
}