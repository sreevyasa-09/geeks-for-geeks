class Solution {
    int maxLength(int arr[]) {
        // code here
        Map<Integer, Integer> mp = new HashMap<>();
        int n = arr.length;
        int sum = 0, maxi = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
            if(sum == 0){
                maxi = i + 1;
            }
            else if(mp.containsKey(sum)){
                maxi = Math.max(maxi, i - mp.get(sum));
            }
            else{
                mp.put(sum, i);
            }
        }
        return maxi;
    }
}