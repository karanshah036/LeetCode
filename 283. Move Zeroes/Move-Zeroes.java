// Time Complexity O(n)
// Space Complexity O(1)
class Solution {
    public void moveZeroes(int[] nums) {
        int pointer=0,zeros=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[pointer++]=nums[i];
            }
            else{
                zeros++;
            }
        }
        for(int i=nums.length-1;i>nums.length-zeros-1;i--){
            nums[i]=0;
        }
    }
}