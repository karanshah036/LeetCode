// Time Complexity O(l1+l2)
// Space Complexity O(l1+l2)
// Recursive Approach
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        return recursion(list1,list2);
    }
    public ListNode recursion(ListNode list1, ListNode list2){
        if(list1==null && list2==null)return null;
        if(list1==null && list2!=null) return list2;
        if(list1!=null && list2==null) return list1;
        if(list1.val<=list2.val){
            list1.next=recursion(list1.next,list2);
            return list1;
        }else{
            list2.next=recursion(list1,list2.next);
            return list2;
        }
    }
}
// Iterative Approach
// Time Complexity O(l1+l2)
// Space Complexity O(1)
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode pointer=dummy;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                pointer.next=list1;
                list1=list1.next;
            }
            else{
                pointer.next=list2;
                list2=list2.next;
            }
            pointer=pointer.next;
        }
        if(list1==null)pointer.next=list2;
        else pointer.next=list1;
        return dummy.next;
    }
}