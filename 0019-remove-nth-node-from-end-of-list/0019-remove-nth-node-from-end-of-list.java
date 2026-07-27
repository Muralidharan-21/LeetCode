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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        

        ArrayList<ListNode> arr = new ArrayList<>();

        ListNode temp = head;

        while(temp!=null){
            arr.add(temp);
            temp = temp.next;
        }

        int indexToRemove = arr.size() - n;
        if(indexToRemove == 0){
            return head.next;
        }

        ListNode prev = arr.get(indexToRemove -1);

        if(indexToRemove == arr.size()-1){
            prev.next = null;
        }
        else{
            prev.next = arr.get(indexToRemove+1);
        }

        return head;
        
    }
}