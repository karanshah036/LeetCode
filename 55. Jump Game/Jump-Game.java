// Time Complexity O(n)
// Space Complexity O(1)
class Solution {
    public boolean canJump(int[] nums) {
        int travel=nums[0];
        int i=0;
        do{
            if(i==nums.length-1) return true;
            if(travel>0){
                i++;
                if(i==nums.length-1) return true;
                travel=Math.max(travel-1,nums[i]);
            }else{
                if(i==nums.length-1) return true;
                return false;
            }
        }while(travel>0);
        return false;
    }
}