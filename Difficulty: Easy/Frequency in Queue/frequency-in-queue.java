class Geeks {
    static void enqueue(Queue<Integer> q, int k) {
        //  code here
        q.add(k);
    }

    static int findFrequency(Queue<Integer> q, int k) {

        
        //  code here
        int count = 0;
        for(int i = 0; i < q.size(); i++){
            int f = q.poll();
            if(f == k) count++;
            q.add(f);
        }
        return count;
    }
}