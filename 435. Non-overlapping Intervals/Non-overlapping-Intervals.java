// Time Complexity O(n log n)
// Space Complexity O(1)
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count=0;
        Arrays.sort(intervals,(a,b)->a[0]==b[0]?b[1]-a[1]:a[0]-b[0]);
        int[] firstInterval=intervals[0];
        for(int i=1;i<intervals.length;i++){
            if(firstInterval[1]>intervals[i][0]){
                if(intervals[i][1]<firstInterval[1]) firstInterval=intervals[i];
                 count++;
            }else{
                firstInterval=intervals[i];
            }
        }
        return count;
    }
}