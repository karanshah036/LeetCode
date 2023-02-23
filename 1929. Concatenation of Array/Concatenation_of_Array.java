// Time Complexity O(n)
// Space Complexity O(1) (Ignoring the output array)
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[i+nums.length]=nums[i];
        }
        return ans;
    }
}