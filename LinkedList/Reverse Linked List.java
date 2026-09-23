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
        ListNode curr = head;
        ListNode prev =  null;
        ListNode next = head;
        while(nextt!=null){
            
            curr = prev;
            curr.next = curr;
            curr = curr.next;
            prev = prev.next;
        }
        return curr;
    }
}
