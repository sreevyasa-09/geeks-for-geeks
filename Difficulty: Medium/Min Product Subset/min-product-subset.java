class Solution {
    public int minProd(int[] arr) {

        int negativeCount = 0;
        int zeroCount = 0;

        int product = 1;

        // Negative number closest to zero
        int largestNegative = Integer.MIN_VALUE;

        // Smallest positive number
        int smallestPositive = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {
                zeroCount++;
            }

            else if (arr[i] < 0) {
                negativeCount++;

                product *= arr[i];

                largestNegative = Math.max(largestNegative, arr[i]);
            }

            else {
                product *= arr[i];

                smallestPositive =
                    Math.min(smallestPositive, arr[i]);
            }
        }

        // No negative numbers
        if (negativeCount == 0) {

            if (zeroCount > 0) {
                return 0;
            }

            return smallestPositive;
        }

        // Odd number of negative numbers
        if (negativeCount % 2 == 1) {
            return product;
        }

        // Even number of negative numbers
        // Remove negative number closest to zero
        return product / largestNegative;
    }
}