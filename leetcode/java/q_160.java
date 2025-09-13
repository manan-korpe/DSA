//Time Complexity O(m*n) 
//space complexity O(1)
public class q_160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;

        // Traverse both lists
        while (a != b) {
            // If a reaches end, switch to headB
            a = (a == null) ? headB : a.next;
            // If b reaches end, switch to headA
            b = (b == null) ? headA : b.next;
        }

        // Either the intersection node or null
        return a;
    }
}

//Time Complexity O(m + n) 
//space complexity O(1)
public Optimal {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;

        // Traverse both lists
        while (a != b) {
            // If a reaches end, switch to headB
            a = (a == null) ? headB : a.next;
            // If b reaches end, switch to headA
            b = (b == null) ? headA : b.next;
        }

        // Either the intersection node or null
        return a;
    }
}



