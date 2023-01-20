/*Q)Palindrome Linked List

Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

Example 1:
Input: head = [1,2,2,1]
Output: true

Example 2:
Input: head = [1,2]
Output: false


CODE:*/

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

       ListNode cur=head;
       ListNode prev=null;

      while(cur!=null){
          ListNode temp=cur.next;
          cur.next=prev;
          
          prev=cur;
          cur=temp;
         
      }
return prev;

        
    }
    
    public boolean isPalindrome(ListNode head) {
      
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        if(fast!=null){
            slow=slow.next;
        }
        
        slow=reverseList(slow);
        fast=head;
        
        while(slow!=null){
            if(slow.val!=fast.val){
                return false;
            }
            slow=slow.next;
            fast=fast.next;
        }
        return true;
        
        
        
    }
}
