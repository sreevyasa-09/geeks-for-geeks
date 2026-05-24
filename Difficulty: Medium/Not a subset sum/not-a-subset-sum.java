class Solution {
    public int findSmallest(int[] arr) {
        Arrays.sort(arr);
        int smallest = 1;
        
        for(int val: arr) {
            if(val > smallest) {
                return smallest;
            }
            
            smallest += val;
        }
        
        return smallest;
    }
}