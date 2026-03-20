class Solution {
    int missingNum(int arr[]) {
        // code here
        int n = arr.length;
        int key = 0;
        for(int i = 1; i <= (n+1); i++){
            key = key^i;
            if(i <= n){
                key = key^arr[i - 1];
            }
        }
        return key;
    }
}