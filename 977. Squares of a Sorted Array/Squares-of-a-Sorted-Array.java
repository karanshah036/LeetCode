// Time Complexity O(n)
// Space Complexity O(n)
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] sorted = new int[nums.length];
        int pointer=nums.length-1;
        int start=0,end=nums.length-1;
        while(start<end){
            if(Math.abs(nums[start])>=Math.abs(nums[end])){
                sorted[pointer--]=nums[start]*nums[start++];
            }else{
                sorted[pointer--]=nums[end]*nums[end--];
            }
        }
        sorted[pointer]=nums[start]*nums[start];
        return sorted;
    }
}