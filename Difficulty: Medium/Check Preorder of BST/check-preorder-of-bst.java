class Solution {
    public boolean canRepresentBST(List<Integer> arr) {
        // code here
        Stack<Integer> s = new Stack<>();
        int root = Integer.MIN_VALUE;
        for(int val: arr){
            while(!s.isEmpty()&& s.peek() < val){
                root = s.pop();
            }
            if(root > val)
                return false;
            s.push(val);
        }
        return true;
    }
}