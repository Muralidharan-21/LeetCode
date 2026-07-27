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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ArrayList<Integer> arr = new ArrayList<>();

        if(head==null){
            return null;
        }

        ListNode temp = head;
        while(temp!=null){
            arr.add(temp.val);
            temp = temp.next;
        }

        int i = left - 1;
        int j = right-1;

        while(i<j){
            int t = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,t);
            i++;
            j--;
        }

        ListNode temp2 = head;

        for(int x : arr){
            temp2.val = x;
            temp2 = temp2.next;
        }
        return head;

        
        
    }
}




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


//    //  OPTIMISED SOLUTION 
// class Solution {
//     public ListNode reverseBetween(ListNode head, int left, int right) {

//         if(head==null || left==right){return head;}

//         ListNode Dummy  = new ListNode(0);
//         Dummy.next = head;
//         ListNode prev = Dummy; 

//         for(int i = 1 ; i < left ;i++){
//             prev = prev.next;
//         }


//         ListNode cur = prev.next;
//         ListNode prevNode = null; 

//         for(int i = 0; i<right-left+1 ;i++){
//             ListNode next = cur.next;
//             cur.next = prevNode;

//             prevNode = cur;
//             cur = next;
//         }

//         prev.next.next = cur;
//         prev.next = prevNode;

//         return Dummy.next;
//     }
// }