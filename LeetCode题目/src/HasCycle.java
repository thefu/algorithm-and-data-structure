//给你一个链表的头节点 head ，判断链表中是否有环。
public class HasCycle {
    public boolean hasCycle(ReverseList.ListNode head) {
        if (head == null)
            return false;
        ReverseList.ListNode slow = head;
        ReverseList.ListNode fast = head;
        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

//给定一个链表的头节点  head ，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
    public ReverseList.ListNode detectCycle(ReverseList.ListNode head) {
        ReverseList.ListNode fast = head, slow = head;
        while (true) {
            if (fast == null || fast.next == null) return null;
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) break;
        }
        fast = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }


}
