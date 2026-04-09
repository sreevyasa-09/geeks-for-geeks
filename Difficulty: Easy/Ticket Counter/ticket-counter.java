class Solution {
    public static int distributeTicket(int n, int k) {
        boolean flag = true;
        int f = 1, r = n;

        while (f <= r) {
            if (flag) {   // sell from front
                if (f + k - 1 >= r) {
                    return r;
                }
                f = f + k;
            } else {      // sell from rear
                if (r - k + 1 <= f) {
                    return f;
                }
                r = r - k;
            }
            flag = !flag;
        }

        return -1;
    }
}