// Time complexity O(m)
// Space complexity O(1)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pointer=nums1.length-1;
        m--;
        n--;
        while(m>=0 && n>=0){
            if(nums1[m]>=nums2[n]){
                nums1[pointer--]=nums1[m--];
            }else{
                nums1[pointer--]=nums2[n--];
            }
        }
        while(n>=0) nums1[pointer--]=nums2[n--];
    }
}
