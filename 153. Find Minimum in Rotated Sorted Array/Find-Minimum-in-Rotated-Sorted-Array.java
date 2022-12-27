// Time complexity O(n)
// Space complexity O(1)
class Solution {
    public int findMin(int[] nums) {
        if(nums.length==1) return nums[0];
        int start=0,end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[mid+1])return nums[mid+1];
            else if(nums[mid]>nums[start]){
                if(nums[mid]<nums[end])end=mid-1;
                else start=mid+1;
            }else{
                end=mid;
            }
        }
        return nums[start];
    }
}