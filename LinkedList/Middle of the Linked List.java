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
        ListNode temp = head;
        ListNode curr = head;
        int index = 0;
        int n = 0;
        while(curr!=null){
            curr = curr.next;
            n++;
        }
        if(n%2==0){
            index = (n /2)+1;
            for(int i = 1; i< index; i++){
                temp = temp.next;
            }
        }else{
            index = (n/2) +1;
            for(int i =1; i<index; i++){
                temp = temp.next;
            }
        }
        return temp;
    }
}
