package hundred_days_challenge;

/**
 * @author abdelrahmanelessawy, 05/01/2021
 */
public class RemoveDuplicatesFromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        ListNode next = head.next;
        ListNode prev = head;
        while (next != null) {
            if (next.val == prev.val) {
                while (next != null && next.val == prev.val) {
                    next = next.next;
                }
                prev = next;
                if (next != null) {
                    next = next.next;
                }
            } else {
                cur.next = prev;
                cur = cur.next;
                cur.next = null;
                prev = next;
                next = next.next;
            }
        }
        cur.next = prev;
        return dummy.next;
    }
}
