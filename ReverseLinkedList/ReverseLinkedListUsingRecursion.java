class Solution {
    private ListNode tail;
    private ListNode newHead;
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        if(temp != null && temp.next == null){
            tail = temp;
            newHead = tail;
            return newHead;
        }
        if(temp!= null){
            reverseList(temp.next);
            tail.next = temp;
            tail = temp;
            tail.next = null;
            return newHead;
        }else{
            return null;
        }
    }
}
