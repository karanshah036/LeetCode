// Time Complexity O(n)
// Space Complexity O(1)
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        int numberOfNodes=0;
        if(k==0 ||head==null)return head;
        ListNode temp=head;
        while(temp!=null){
            numberOfNodes++;
            temp=temp.next;
        }
        k=k%numberOfNodes;
        temp=head;
        for(int i=0;i<numberOfNodes-k-1;i++){
            temp=temp.next;
        }
        ListNode newHead=temp.next;
        temp.next=null;
        ListNode pointer=newHead;
        while(pointer.next!=null){
            pointer=pointer.next;
        }
        pointer.next=head;
        return newHead;
    }
}