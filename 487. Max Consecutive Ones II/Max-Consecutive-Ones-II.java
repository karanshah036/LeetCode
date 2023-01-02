// Time complexity O(n)
// Space Complexity O(1)
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int zeros=0,count=0,start=0,max=0;
        for(int i=0;i<nums.length;i++){
          if(nums[i]==1) count++;
          else{
            while(zeros==1){
                if(nums[start++]==0) zeros--;
                count--;
            }
            zeros++;
            count++;
          }
          max=Math.max(count,max);
        }
        return max;
    }
}