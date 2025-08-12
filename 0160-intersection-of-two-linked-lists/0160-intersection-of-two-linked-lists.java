public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        
        ListNode tempA = headA;
        ListNode tempB = headB;
        
        int lengthA = 0;
        while(tempA != null){
            lengthA++;
            tempA = tempA.next;
        } 
        
        int lengthB = 0;
        while(tempB != null){
            lengthB++;
            tempB = tempB.next;
        }
        
        tempA = headA;
        tempB = headB;

        if (lengthA > lengthB) {
            int steps = lengthA - lengthB;
            for (int i = 0; i < steps; i++) {
                tempA = tempA.next;
            }
        } else if (lengthB > lengthA) {
            int steps = lengthB - lengthA;
            for (int i = 0; i < steps; i++) {
                tempB = tempB.next;
            }
        }
        
        while (tempA != tempB) {
            tempA = tempA.next;
            tempB = tempB.next;
        }
        
        return tempA;
    }
}