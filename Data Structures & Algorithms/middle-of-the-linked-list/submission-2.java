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
    public ListNode middleNode(ListNode head) {
        ListNode curr = head;
        double count = 0;
        while(curr != null){
            count += 1;
            curr = curr.next;
        }

        if(count==1){
            count = 1;
            return head;
        }else{
            count = count/2;
        }
        count = Math.floor(count);

        int temp = 1;

        while(temp<count){
            head = head.next;
            temp +=1;
        }
        head = head.next;

        return head;
    }
}