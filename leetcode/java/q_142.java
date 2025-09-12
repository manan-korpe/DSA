// Time Complexity: O(n)
// Space Complexity: O(1) (constant space)
//using tow pointer

public class q_142 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode i = head, j = head.next;

        while (i != null && j != null) {
            if (i == j)
                return true;

            if (j.next != null) {
                j = j.next.next;
            } else {
                j = j.next;
            }

            i = i.next;
        }

        return false;
    }

}

// simple
// same time and space complexity
public class Solution {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false; // No cycle possible if less than 2 nodes
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // Move slow pointer by 1
            fast = fast.next.next; // Move fast pointer by 2

            if (slow == fast) {
                return true; // Cycle detected
            }
        }

        return false; // No cycle
    }
}
