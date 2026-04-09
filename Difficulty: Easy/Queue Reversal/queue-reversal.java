class Solution {
    public void reverseQueue(Queue<Integer> q) {
        // code here
        Stack<Integer> s = new Stack<>();
        int n = q.size();
        for(int i = 0; i < n; i++){
            s.push(q.poll());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
}