class Solution {
    public int maxArea(int[] height) {
        int start=0,end=height.length-1;
        int max=0;
        while(start<end){
            int length=end-start;
            int breadth = Math.min(height[start],height[end]);
            int area=length*breadth;
            max=Math.max(area,max);
            if(height[start]>=height[end]) end--;
            else start++;
        }
        return max;
    }
}