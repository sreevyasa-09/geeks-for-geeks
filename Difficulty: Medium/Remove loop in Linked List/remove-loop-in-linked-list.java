/*
class Node
{
    int data;
    Node next;
}
*/

class Solution {
    public static void removeLoop(Node head) {
        // code here
       Node slow =  head;
       Node fast = head;
       boolean hasloop = false;
       while(fast != null && fast.next != null){
           slow = slow.next;
           fast = fast.next.next;
           if(slow == fast){
               hasloop = true;
               break;
           }
       }
           if(!hasloop) return;
           slow = head;
           if(slow == fast){
               while(fast.next != slow){
                   fast = fast.next;
               }
               fast.next = null;
               return;
           }
           while(slow.next != fast.next){
               fast = fast.next;
               slow = slow.next;
           }
           fast.next = null;
    }
}

