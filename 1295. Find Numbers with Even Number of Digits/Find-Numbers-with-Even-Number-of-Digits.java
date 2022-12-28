// Time Complexity O(n)
// Space Complexity O(1)
class Solution {
    public int findNumbers(int[] nums) {
        int result = 0;
        for(int i = 0 ; i < nums.length ; i++){
            int count = (int)Math.log10(nums[i]) + 1;
            if(count % 2 == 0) result++;
        }
        return result;
    }
}

// Time Complexity O(n)
// Space Complexity O(1)
class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i =0 ; i< nums.length; i++){
            if((nums[i]>9 && nums[i]<100) || (nums[i]>999 && nums[i]<10000) || nums[i]==100000){
                count++;
            }
        }
        return count;
    }
}