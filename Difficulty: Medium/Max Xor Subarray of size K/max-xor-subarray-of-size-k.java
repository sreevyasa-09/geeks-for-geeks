class Solution {
    public int maxSubarrayXOR(int[] arr, int k) {
        // code here
        int i = 0, n= arr.length;
        int max = Integer.MIN_VALUE;
        int xor = 0;
        
        for(int j=0; j<n; j++){
            xor ^= arr[j];
            
            if(j - i + 1 == k){
                max = Math.max(max, xor);
                xor ^= arr[i];
                i++;
            }
            
        }
        return max;
    }
}