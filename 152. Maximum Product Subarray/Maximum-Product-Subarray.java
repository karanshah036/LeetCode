// Time Complexity O(n)
// SpaceComplexity O(n)

class Solution {
    public int maxProduct(int[] nums) {
        int curMax=1;
        int curMin = 1;
        int result = Integer.MIN_VALUE;
        for(int num : nums){
            if(num==0){
                curMax=1;
                curMin=1;
            }
            int temp = curMax * num;
            curMax=Math.max(Math.max(curMax*num,curMin*num),num);
            curMin=Math.min(Math.min(temp,curMin*num),num);
            result =  Math.max(result,curMax);
        }
        return result;
    }
}