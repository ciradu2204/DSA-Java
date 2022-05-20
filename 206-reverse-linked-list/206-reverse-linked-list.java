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
        
 // Iterative Approach       
//         ListNode prev = null;
//         ListNode next = null;
//         ListNode currentNode = head; 
//         while(currentNode != null){
//             next = currentNode.next; 
//             currentNode.next = prev; 
//             prev = currentNode; 

//             currentNode = next; 
//         }
        
//         return prev;
        
        ListNode result = recursive(head, null);  
         return result; 
    }
    
    public ListNode recursive(ListNode currentNode, ListNode prev){
        
        if(currentNode == null){
          return prev; 
        }
        
        ListNode next = currentNode.next; 
        currentNode.next = prev; 
        
        return recursive(next, currentNode); 
        
        
    }
    
    
    
    
    //prev pointer
    //next element 
    
    
}