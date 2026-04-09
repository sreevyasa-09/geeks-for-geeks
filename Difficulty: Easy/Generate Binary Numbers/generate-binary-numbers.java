class Solution {
    public ArrayList<String> generateBinary(int n) {
        // code here
        ArrayList<String> list = new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        q.add("1");
        for(int i = 1 ; i <= n; i++){
            String f = q.poll();
            list.add(f);
            q.add(f + "0");
            q.add(f + "1");
        }
        return list;
    }
}
