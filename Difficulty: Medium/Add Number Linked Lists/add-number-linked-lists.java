/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public Node addTwoLists(Node head1, Node head2) {
        // code here
        Node temp1 = reverseList(head1);
        Node temp2 = reverseList(head2);
        int c = 0;
         int sum = 0;
         Node ansHead = null;
         while(temp1 != null || temp2 != null || c != 0) {
             sum = c;
             if(temp1 != null) {
                 sum = sum + temp1.data;
                 temp1 = temp1.next;
             }
             if(temp2 != null) {
                 sum = sum + temp2.data;
                 temp2 = temp2.next;
             }
             c = sum / 10;
             Node nextNode = new Node(sum % 10);
             nextNode.next = ansHead;
             ansHead = nextNode;
         }
        while(ansHead != null && ansHead.data == 0 && ansHead.next != null) {
            ansHead = ansHead.next;
        }
         return ansHead;
     
    }
    Node reverseList(Node head) {
        Node prev = null;
        Node cur = head;
        while(cur != null){
            Node next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}