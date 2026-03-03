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
    public boolean isPalindrome(ListNode head) {
        //Find Middle by Floyd Algorithm
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode mid=slow;

        //reverse from the mid node
        ListNode prev=null;
        ListNode curr=mid;
        while(curr!=null){
            ListNode temp= curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        //head2 because we reversed onlt the half list and we will compare
        ListNode head2=prev;
        while(head!= null && head2 !=null) {   // only need to check second half
            if(head.val != head2.val) {
                return false;
            }
            else{
                head = head.next;
                head2 = head2.next;
            }
        }

        return true;
    }
}