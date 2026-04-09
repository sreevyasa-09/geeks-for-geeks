import java.util.*;

class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        Stack<Integer> s1 = new Stack<>();
        Queue<Integer> q1 = new LinkedList<>();
        
        int n = q.size();

        if (q == null || q.isEmpty() || k <= 0 || k > q.size()) {
            return q;
        }
        
        for (int i = 0; i < k; i++) {
            s1.push(q.poll());
        }

        while (!s1.isEmpty()) {
            q1.add(s1.pop());
        }

        while (!q.isEmpty()) {
            q1.add(q.poll());
        }

        return q1;
    }
}