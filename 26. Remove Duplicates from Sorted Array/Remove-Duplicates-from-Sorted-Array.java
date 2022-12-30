// Time Complexity O(n)
// Sapce Complexity O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        int pointer=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[pointer]){
                nums[++pointer]=nums[i];
            }
        }
        return ++pointer;
    }
}