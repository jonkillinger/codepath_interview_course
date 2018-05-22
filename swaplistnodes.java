/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode A) {
        if(A == null || A.next == null){
            return A;
        }

        ListNode runner = A.next;
        ListNode follower = A;
        ListNode last = null;


        ListNode temp = runner.next;
        runner.next = follower;
        follower.next = temp;
        A = runner;
        last = follower;

        while(last.next != null && last.next.next != null){
            follower = last.next;
            runner = last.next.next;
            temp = runner.next;
            runner.next = follower;
            follower.next = temp;
            last.next = runner;
            last = follower;
        }
        return A;

    }
}
