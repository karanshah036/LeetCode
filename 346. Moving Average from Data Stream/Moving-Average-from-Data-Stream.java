// Time Complexity O(1)
// Space Complexity O(n)
class MovingAverage {
    Queue<Integer> queue;
    double sum=0;
    int capacity=0,max=0;
    public MovingAverage(int size) {
        queue=new LinkedList<>();
        max=size;
    }
    
    public double next(int val) {
        if(capacity==max){
            sum-=queue.poll();
            capacity--;
        }
        queue.add(val);
        sum+=val;
        capacity++;
        return sum/queue.size();
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */