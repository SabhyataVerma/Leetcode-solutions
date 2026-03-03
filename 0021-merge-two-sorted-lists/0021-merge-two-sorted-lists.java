/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(Integer.MAX_VALUE);
        ListNode mh=dummy;
        ListNode mt=dummy;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                mt.next=list1;
                list1=list1.next;
                mt=mt.next;
            }
            else{
                mt.next=list2;
                list2=list2.next;
                mt=mt.next;
            }
        }
        if(list1!=null){
            mt.next=list1;
        }
        else if(list2!=null){
            mt.next=list2;
        }
        return dummy.next;
    }
}