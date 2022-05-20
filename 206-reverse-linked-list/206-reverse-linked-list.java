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
    public ListNode reverseList(ListNode head) {
        
        
        ListNode prev = null;
        ListNode next = null;
        ListNode currentNode = head; 
        while(currentNode != null){
            next = currentNode.next; 
            currentNode.next = prev; 
            prev = currentNode; 

            currentNode = next; 
        }
        
        return prev;
        
    }
    
    
    //prev pointer
    //next element 
    
    
}