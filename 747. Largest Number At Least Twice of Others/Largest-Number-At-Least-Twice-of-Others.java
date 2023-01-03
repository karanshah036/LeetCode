// Time Complexity O(n)
// Space Complexity O(1)
class Solution {
    public int dominantIndex(int[] nums) {
        int highest=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[highest])highest=i;
        }
        for(int i=0;i<nums.length;i++){
            if(i!=highest && 2*nums[i]>nums[highest])return -1;
        }
        return highest;
    }
}