// Time Complexity O(n log n)
// Space Complexity O(n)
class Solution {
    public int minMeetingRooms(int[][] interval) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        Arrays.sort(interval,(a,b)->a[0]-b[0]);
        for(int[] i:interval){
            if(queue.isEmpty()) queue.offer(i[1]);
            else{
              if(queue.peek()<=i[0]) queue.poll();
              queue.offer(i[1]);
            }
        }
        return queue.size();
    }
}