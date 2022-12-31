// Time complexity O(n)
// Space Complexity O(1)
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int start=0,end=0;
        while(end!=nums.length && start!=nums.length){
            if(nums[start]%2!=0){
                while(end<nums.length && nums[end]%2!=0){
                    end++;
                }
                if(end==nums.length)break;
                int temp = nums[end];
                nums[end++]=nums[start];
                nums[start++]=temp;
            }else{
                start++;
                end++;
            }
        }
        return nums;
    }
}