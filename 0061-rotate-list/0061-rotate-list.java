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
    public ListNode rotateRight(ListNode head, int k) {
        // Edge cases
        if(head == null || head.next == null || k == 0){
            return head;
        }

        // Step 1: Find number of nodes
        int n = 1;
        ListNode temp = head;
        while(temp.next != null){
            n++;
            temp = temp.next;
        }

        // Step 2: Make circular linked list
        temp.next = head;

        // Step 3: Effective rotations
        int r = k % n;

        // If no rotation needed
        if(r == 0){
            temp.next = null;
            return head;
        }

        // Step 4: Find new tail (n - r - 1 steps from head)
        int steps = n - r;
        ListNode newTail = head;
        for(int i = 1; i < steps; i++){
            newTail = newTail.next;
        }

        // Step 5: Break the circle
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}