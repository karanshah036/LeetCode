// Iterative Approach 
// Time Complexity O(n)
// Space Compelexity O(1)
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode dummy = new ListNode(0,head);
        ListNode previous=null;
        while(head!=null){
            ListNode temp = head.next;
            head.next=previous;
            previous=head;
            head=temp;
        }
        return previous;
    }
}

// Recursive Approach
// Time Complexity O(n)
// Space Compelexity O(n)
class Solution {
    public ListNode reverseList(ListNode head) {
        return reverse(head,null);
    }
    public ListNode reverse(ListNode head, ListNode previous){
        if(head==null) return previous;
        ListNode temp=head.next;
        head.next=previous;
        return reverse(temp,head);
    }
}