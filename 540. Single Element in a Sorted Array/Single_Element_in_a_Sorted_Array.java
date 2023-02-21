// Time complexity O(log n)
// Space complexity O(1)
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int start=0,end=nums.length-1;
        while(start+1<end){
            int mid = start + (end-start)/2;
            if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]){
                return nums[mid];
            }else if((mid-start+1)%2==0){
                if(nums[mid]==nums[mid-1])start=mid+1;
                else end= mid;
            }else{
                if(nums[mid]==nums[mid+1]) start=mid;
                else end=mid-1;
            }
        }
        return nums[start];

    }
}