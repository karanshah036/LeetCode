// Time Complexity O(1)
// Space Complexity O(n)
class MyCircularQueue {
    int[] queue;
    int head=-1,tail=-1,capacity=0,size=0;
    public MyCircularQueue(int k) {
        queue = new int[k];
        size=k;
    }
    
    public boolean enQueue(int value) {
        if(!isFull()){
            if(head==-1)head=0;
            tail++;
            if(tail==size)tail=0;
            queue[tail]=value;
            capacity++;
            return true;
        }
        return false;
    }
    
    public boolean deQueue() {
        if(!isEmpty()){
            queue[head]=0;
            head++;
            if(head==size)head=0;
            capacity--;
            if(isEmpty()){
                head=-1;
                tail=-1;
            }
            return true;
        }
        return false;
        
    }
    
    public int Front() {
        if(head==-1) return -1;
        return queue[head];
    }
    
    public int Rear() {
        if(tail==-1)return -1;
        return queue[tail];
    }
    
    public boolean isEmpty() {
        return capacity==0;
    }
    
    public boolean isFull() {
        return capacity==size;
    }
}