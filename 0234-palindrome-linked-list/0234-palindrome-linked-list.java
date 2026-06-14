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
    public boolean isPalindrome(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        while(slow!=null){
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        fast = head;

        while(prev!=null){
            if(prev.val!=fast.val){
                return  false;
            }
            prev = prev.next;
            fast = fast.next;
        }  
        return true;

        
    }
}