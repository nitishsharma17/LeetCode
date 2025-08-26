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

    public ListNode sort(ListNode l1 , ListNode l2){
        ListNode temp = new ListNode(0);
        ListNode tail = temp;
            while(l1 != null  && l2 != null){
                if(l1.val < l2.val){
                    tail.next = l1;
                    l1 = l1.next;
                }else{
                    tail.next = l2;
                    l2 = l2.next;
                }
                tail = tail.next;
            }
            if(l1 != null) tail.next = l1;
            if(l2 != null) tail.next = l2;

            return temp.next;
            
    }

    public ListNode sortList(ListNode head) {
        if(head == null || head.next== null) return head;

        ListNode slow = head;
        ListNode fast =  head;
        ListNode prev = null;

        while(fast !=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;

        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);

        return sort(l1,l2);
    }
}