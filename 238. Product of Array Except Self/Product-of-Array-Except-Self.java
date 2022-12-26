Time Complexity O(n)
Space Complexity O(n)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] product = new int[nums.length];
        int multiply=1;
        for(int i=0;i<nums.length;i++){
            product[i]=multiply;
            multiply*=nums[i];
        }
        multiply=1;
        for(int i=nums.length-1;i>=0;i--){
            product[i]=product[i]*multiply;
            multiply*=nums[i];
        }
        return product;
    }
}