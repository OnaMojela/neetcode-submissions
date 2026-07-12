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
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        
        ListNode curr = head;
        ListNode newhead = curr.next;
        ListNode prev = newhead;
        ListNode save = curr;

        while(newhead != null){
            newhead = newhead.next;
            prev.next = save;
            curr.next = newhead;
            save = prev;
            prev = newhead;

        }
        newhead = save;

        return newhead;

        

        
    }
}
