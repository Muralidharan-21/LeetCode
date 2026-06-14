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
    public int pairSum(ListNode head) {

        int max = Integer.MIN_VALUE;

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse
        ListNode prev = null;
        while(slow!=null){
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;  
        }

        fast = head;
        while(prev!=null){
            max = Math.max(max,fast.val+prev.val);
            fast = fast.next;
            prev = prev.next;
        }

        return max;

        
    }
}