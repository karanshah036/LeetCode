// Time Complexity O(n)
// Space Complexity O(1)
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start=0,end=0,min=Integer.MAX_VALUE,sum=0;
        while(start<nums.length && end<nums.length){
            if(sum>=target){
                min=Math.min(min,end-start);
                sum-=nums[start++];
            }else{
                sum+=nums[end++];
            }
        }
        while(sum>=target){
            min=Math.min(end-start,min);
            sum-=nums[start++];
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}