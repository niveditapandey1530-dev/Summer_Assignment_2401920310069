public /**
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
        ListNode flag=head;
        int count=0;
        while(flag!=null){
            count++;
            flag=flag.next;
        }
        if(count==n){
            return head.next;
        }
        int position=count-n;
        flag=head;
        for(int i=1;i<position;i++){
            flag=flag.next;
        }
        flag.next =flag.next.next;
        return head;
    }
} {
    
}
