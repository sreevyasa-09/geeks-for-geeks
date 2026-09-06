class Solution {
    public long pairAndSum(int[] arr) {
        long ans = 0;
        int n = arr.length;

        for (int i = 0; i < 32; i++) {
            long count = 0;

            for (int j = 0; j < n; j++) {
                // Check if ith bit is set
                if ((arr[j] & (1L << i)) != 0) {
                    count++;
                }
            }

            // Number of pairs = countC2
            ans += (1L << i) * (count * (count - 1) / 2);
        }

        return ans;
    }
}