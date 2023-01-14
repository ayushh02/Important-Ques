/*Q) Remove Duplicates from Sorted List II

Given the head of a sorted linked list, delete all nodes that have duplicate numbers,
leaving only distinct numbers from the original list.Return the linked list sorted as well.

 Example 1:
Input: head = [1,2,3,3,4,4,5]
Output: [1,2,5]

Example 2:
Input: head = [1,1,1,2,3]
Output: [2,3]

Approach
1.Set up a dummy node which has address of head node.
2.create another node (prev node) to store previous node so that we can link it to distinct node after skipping duplicates.
3.Check if value of head equal to its next value if it is then increment head till it is not equal.
4.then link prev node to head.next(node which has value different than head).and just like that increment through whole linked list.



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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=new ListNode();
        temp.next=head;
        ListNode prev=temp;

        while(head!=null){
            if(head.next!=null && head.val==head.next.val){
                while(head.next!=null && head.val==head.next.val){
                    head=head.next;
                }
                prev.next=head.next;
            }
            else{
                prev=prev.next;   
            }
            head=head.next;
            
        }
        return temp.next;
    }
}
