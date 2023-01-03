// Time Complexity O(n)
// Space Complexity O(1)
class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum=0,rightSum=0;
        for(int i=0;i<nums.length;i++){
            rightSum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(rightSum-nums[i]==leftSum)return i;
            else{
                rightSum-=nums[i];
                leftSum+=nums[i];
            }
        }
        return -1;
    }
}