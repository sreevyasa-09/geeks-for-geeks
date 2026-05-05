class Solution {
public:
    long long sumXOR(vector<int>& arr) {
        long long result = 0;
        int n = arr.size();

        for (int b = 0; b < 32; b++) {
            long long ones = 0;
            for (int x : arr)
                if ((x >> b) & 1) ones++;
            
            long long zeros = n - ones;
            result += ones * zeros * (1LL << b);
        }

        return result;
    }
};