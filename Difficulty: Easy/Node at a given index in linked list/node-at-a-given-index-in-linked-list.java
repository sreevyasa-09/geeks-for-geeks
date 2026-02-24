/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class Solution {
    public int GetNth(Node head, int index) {
        // Code here
        if(head == null) return -1;
        if(index == 1) return head.data;
        return GetNth(head.next, index-1);
    }
}