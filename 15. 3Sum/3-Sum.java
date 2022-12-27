class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        if(nums.length<=2) return list;
        int i=0;
        while(i<nums.length-2){
            int j=i+1,k=nums.length-1;
            if(nums[i]>0)break;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0) list.add(Arrays.asList(nums[i],nums[j],nums[k]));
                if(sum<=0)while(j<k && nums[j]==nums[++j]);
                if(sum>=0)while(j<k && nums[k--]==nums[k]);
            }
            while(nums[i]==nums[++i] && i<nums.length-2);
        }
        return list;
    }
}