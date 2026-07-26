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

        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // reverse the half

        ListNode prev = null;
        ListNode curr = slow;
        while(curr!= null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next; 
        }

        ListNode l1 = head;

        while(prev!=null){
            
            if(prev.val!=l1.val){
                return false;
            }
            prev = prev.next;
            l1 = l1.next;
        }
        return true;
        
    }
    
}

















// class Solution {
//     public boolean isPalindrome(ListNode head) {

//         ListNode fast = head;
//         ListNode slow = head;

//         while(fast!=null && fast.next!=null){
//             slow=slow.next;
//             fast = fast.next.next;
//         }

//         ListNode prev = null;
//         while(slow!=null){
//             ListNode next = slow.next;
//             slow.next = prev;
//             prev = slow;
//             slow = next;
//         }

//         fast = head;

//         while(prev!=null){
//             if(prev.val!=fast.val){
//                 return  false;
//             }
//             prev = prev.next;
//             fast = fast.next;
//         }  
//         return true;

        
//     }
// }