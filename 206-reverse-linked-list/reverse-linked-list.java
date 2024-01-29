class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextNode = current.next; // Save the next node
            current.next = prev; // Reverse the pointer
            prev = current; // Move the pointers one step forward
            current = nextNode; // Move the pointers one step forward
        }

        return prev; // The new head of the reversed list
    }
}
