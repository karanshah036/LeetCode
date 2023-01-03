// Time Complexity O(n)
// Space Complexity O(1)
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                index=nums[i] * (-1) - 1;
            }else{
                index=nums[i]-1;
            }
            if(nums[index]>0){
                nums[index]*=-1;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)list.add(i+1);
        }
        return list;
    }
}