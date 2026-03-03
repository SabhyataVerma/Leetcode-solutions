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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        //Divide and Conquer
        ListNode oh=head;
        ListNode ot=head;
        ListNode eh=head.next;
        ListNode et=head.next;

        //order of (et!=null && et.next!=null) matters
        while(et!=null && et.next!=null){
            ot.next=ot.next.next;
            ot=ot.next;

            et.next=et.next.next;
            et=et.next;
        }
        ot.next=eh;
        return oh;
    }
}