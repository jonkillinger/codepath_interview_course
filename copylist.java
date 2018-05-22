/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode newHead = new RandomListNode(head.label);
        HashMap<Integer, RandomListNode> mapping = new HashMap<>();
        mapping.put(newHead.label, newHead);

        RandomListNode runner = head;
        RandomListNode newRunner = newHead;
        while(runner.next != null){
            mapping.put(runner.next.label, new RandomListNode(runner.next.label));
            newRunner.next = mapping.get(runner.next.label);
            newRunner = newRunner.next;
            runner = runner.next;
        }
        newRunner.next = null;

        runner = head;
        newRunner = newHead;;
        while(runner != null){
            if(runner.random == null){
                newRunner.random = null;
            } else {
            newRunner.random = mapping.get(runner.random.label);
            }
            runner = runner.next;
            newRunner = newRunner.next;
        }
        return newHead;
    }
}
