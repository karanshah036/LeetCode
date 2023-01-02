// Time coompelxity O(n log n)
// Space Complexity O(1)
class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = Arrays.copyOf(heights,heights.length);
        Arrays.sort(expected);
        int indices=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=expected[i]) indices++;
        }
        return indices;
    }
}

// Time coompelxity O(n)
// Space Complexity O(101)-> O(1)
class Solution {
    public int heightChecker(int[] heights) {
        int[] heightMap = new int[101];
        int heightMapPointer=0,count=0;
        for(int i:heights){
            heightMap[i]++;
        }
        for(int i=0;i<heights.length;i++){
            while(heightMap[heightMapPointer]==0) heightMapPointer++;
            if(heightMapPointer!=heights[i]){
                count++;
            }
            heightMap[heightMapPointer]--;
        }
        return count;
    }
}