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
    public void reorderList(ListNode head) {
        if(head == null || head.next== null ){
            return ;
        }
        ListNode slow = head;
        ListNode fast = head;

        while(fast !=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode sh = slow.next;
        slow.next = null;
        ListNode prev = null;

        while(sh!=null){
            ListNode temp = sh.next;
            sh.next = prev;
            prev = sh;
            sh = temp;
        }
        ListNode ans = head;
        while(prev!=null){
            ListNode t1 = ans.next;
            ListNode t2 = prev.next;
            ans.next = prev;
            prev.next = t1;
            ans = t1;
            prev = t2;
        }
    }
}