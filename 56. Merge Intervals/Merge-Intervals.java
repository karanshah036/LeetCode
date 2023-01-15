Time Complexity O(n log n)
Space Complexity O(n)
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> list = new ArrayList<>();
        int[] newInterval = intervals[0];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]> newInterval[1]){
                list.add(newInterval);
                newInterval=intervals[i];
            }
            else{
                newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
                newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
            }
        }
        list.add(newInterval);
        return list.toArray(new int[list.size()][2]);

    }
}
