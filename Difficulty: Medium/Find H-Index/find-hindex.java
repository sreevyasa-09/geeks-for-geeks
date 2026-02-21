class Solution {
    public int hIndex(int[] citations) {
        // code here
        int n = citations.length;
        
        // 1. Sort in descending order
        Arrays.sort(citations);              // ascending
        // reverse logic by iterating from end
        
        int h = 0;
        // i from n-1 down to 0, count = number of papers considered = n - i
        for (int i = n - 1; i >= 0; i--) {
            int papersCount = n - i;         // so far kitne papers liye
            if (citations[i] >= papersCount) {
                h = papersCount;            // H itna ho sakta hai
            } else {
                break;                      // aage wale chhote honge, to fail hi karenge
            }
        }
        return h;
    }
}