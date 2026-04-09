class Solution {
    public Queue<Integer> reverseQueue(Queue<Integer> q) {
        // code here
        int n = q.size();
        if(q.isEmpty())
            return q;
            RQ(q);
    
            return q;
    }
    private void RQ(Queue<Integer> q){
        if(q.isEmpty())
            return;
            int f = q.poll();
            RQ(q);
            q.add(f);
    }
}