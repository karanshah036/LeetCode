class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        Queue<Integer> heap = new PriorityQueue<>(3);
        for(int i:nums){
            if(set.add(i)){
                if(heap.size()<3)heap.offer(i);
                else if(heap.size()==3 && heap.peek()<i){
                    heap.poll();
                    heap.offer(i);
                }
            }
        }
        if(heap.size()==2){
            heap.poll();
            return heap.peek();
        }
        return heap.poll();
    }
}