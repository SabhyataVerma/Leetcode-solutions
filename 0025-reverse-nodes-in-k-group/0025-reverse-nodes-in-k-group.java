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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode prev=null;
        ListNode curr=head;
        int cnt=0;
        while(curr!=null && cnt!=k){
            ListNode temp= curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
            cnt++;
        }
        //recurssion only is k number of nodes are present (for reference consider the diagram)
        if(exists(curr,k)){
            head.next=reverseKGroup(curr, k);
        }
        else{
            head.next=curr;
        }
        return prev;
    }
    public boolean exists(ListNode curr, int k){
        int cnt=0;
        while(curr!=null){
            cnt++;
            curr=curr.next;
            if(cnt==k) return true;
        }
        return false;
    }
}