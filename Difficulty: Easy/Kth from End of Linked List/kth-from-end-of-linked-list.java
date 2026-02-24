/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
        Node ref = head;
        Node main = head;
        for(int i = 1; i < k; i++){
            ref = ref.next;
            if(ref == null) return -1;
        }
        while(ref.next != null){
            ref = ref.next;
            main = main.next;
        }
        return main.data;
    }
}